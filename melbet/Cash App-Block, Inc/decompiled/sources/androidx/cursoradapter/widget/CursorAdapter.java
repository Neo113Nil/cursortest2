package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.SuggestionsAdapter;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider;
import com.datadog.android.rum.internal.domain.display.DisplayInfo;
import com.robinhood.spark.SparkView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.channels.BufferedChannel;

/* loaded from: classes3.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable {
    public boolean mAutoRequery;
    public ChangeObserver mChangeObserver;
    public Context mContext;
    public Cursor mCursor;
    public CursorFilter mCursorFilter;
    public SparkView.AnonymousClass2 mDataSetObserver;
    public boolean mDataValid;
    public int mRowIDColumn;

    public abstract void bindView(View view, Cursor cursor);

    public void changeCursor(Cursor cursor) {
        Cursor swapCursor = swapCursor(cursor);
        if (swapCursor != null) {
            swapCursor.close();
        }
    }

    public abstract String convertToString(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.mDataValid || (cursor = this.mCursor) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            return null;
        }
        this.mCursor.moveToPosition(i);
        if (view == null) {
            ResourceCursorAdapter resourceCursorAdapter = (ResourceCursorAdapter) this;
            view = resourceCursorAdapter.mInflater.inflate(resourceCursorAdapter.mDropDownLayout, viewGroup, false);
        }
        bindView(view, this.mCursor);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.mCursorFilter == null) {
            CursorFilter cursorFilter = new CursorFilter();
            cursorFilter.mClient = this;
            this.mCursorFilter = cursorFilter;
        }
        return this.mCursorFilter;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.mDataValid || (cursor = this.mCursor) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.mCursor;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.mDataValid && (cursor = this.mCursor) != null && cursor.moveToPosition(i)) {
            return this.mCursor.getLong(this.mRowIDColumn);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            a$$ExternalSyntheticBUOutline0.m$1("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.mCursor.moveToPosition(i)) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = newView(this.mContext, this.mCursor, viewGroup);
        }
        bindView(view, this.mCursor);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return !(this instanceof SuggestionsAdapter);
    }

    public final void init(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.mAutoRequery = true;
        } else {
            this.mAutoRequery = false;
        }
        boolean z = cursor != null;
        this.mCursor = cursor;
        this.mDataValid = z;
        this.mContext = context;
        this.mRowIDColumn = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        int i2 = 2;
        if ((i & 2) == 2) {
            this.mChangeObserver = new ChangeObserver(this);
            this.mDataSetObserver = new SparkView.AnonymousClass2(this, i2);
        } else {
            this.mChangeObserver = null;
            this.mDataSetObserver = null;
        }
        if (z) {
            ChangeObserver changeObserver = this.mChangeObserver;
            if (changeObserver != null) {
                cursor.registerContentObserver(changeObserver);
            }
            SparkView.AnonymousClass2 anonymousClass2 = this.mDataSetObserver;
            if (anonymousClass2 != null) {
                cursor.registerDataSetObserver(anonymousClass2);
            }
        }
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        return this.mCursor;
    }

    public Cursor swapCursor(Cursor cursor) {
        Cursor cursor2 = this.mCursor;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ChangeObserver changeObserver = this.mChangeObserver;
            if (changeObserver != null) {
                cursor2.unregisterContentObserver(changeObserver);
            }
            SparkView.AnonymousClass2 anonymousClass2 = this.mDataSetObserver;
            if (anonymousClass2 != null) {
                cursor2.unregisterDataSetObserver(anonymousClass2);
            }
        }
        this.mCursor = cursor;
        if (cursor == null) {
            this.mRowIDColumn = -1;
            this.mDataValid = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        ChangeObserver changeObserver2 = this.mChangeObserver;
        if (changeObserver2 != null) {
            cursor.registerContentObserver(changeObserver2);
        }
        SparkView.AnonymousClass2 anonymousClass22 = this.mDataSetObserver;
        if (anonymousClass22 != null) {
            cursor.registerDataSetObserver(anonymousClass22);
        }
        this.mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
        this.mDataValid = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public final class ChangeObserver extends ContentObserver {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeObserver(CursorAdapter cursorAdapter) {
            super(new Handler());
            this.$r8$classId = 0;
            this.this$0 = cursorAdapter;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            switch (this.$r8$classId) {
                case 0:
                    return true;
                default:
                    return super.deliverSelfNotifications();
            }
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            switch (this.$r8$classId) {
                case 0:
                    CursorAdapter cursorAdapter = (CursorAdapter) this.this$0;
                    if (cursorAdapter.mAutoRequery && (cursor = cursorAdapter.mCursor) != null && !cursor.isClosed()) {
                        cursorAdapter.mDataValid = cursorAdapter.mCursor.requery();
                        break;
                    }
                    break;
                case 1:
                default:
                    super.onChange(z);
                    break;
                case 2:
                    ((BufferedChannel) this.this$0).offer(Unit.INSTANCE);
                    break;
                case 3:
                    if (((DefaultDisplayInfoProvider) this.this$0).systemSettingsWrapper.getInt() != Integer.MIN_VALUE) {
                        DefaultDisplayInfoProvider defaultDisplayInfoProvider = (DefaultDisplayInfoProvider) this.this$0;
                        DisplayInfo displayInfo = defaultDisplayInfoProvider.currentState;
                        Float valueOf = Float.valueOf(MathKt__MathJVMKt.roundToInt((r2 / 255.0f) * 10.0f) / 10.0f);
                        displayInfo.getClass();
                        defaultDisplayInfoProvider.currentState = new DisplayInfo(valueOf);
                        break;
                    }
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ChangeObserver(Object obj, Handler handler, int i) {
            super(handler);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            switch (this.$r8$classId) {
                case 1:
                    ((FontRequestEmojiCompatConfig.FontRequestMetadataLoader) this.this$0).loadInternal();
                    break;
                default:
                    super.onChange(z, uri);
                    break;
            }
        }
    }
}
