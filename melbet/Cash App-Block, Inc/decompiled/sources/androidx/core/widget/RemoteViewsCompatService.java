package androidx.core.widget;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Splitter;
import com.squareup.cash.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {

    public final class RemoteViewsCompatServiceViewFactory implements RemoteViewsService.RemoteViewsFactory {
        public static final Splitter EMPTY = new Splitter(new long[0], new RemoteViews[0]);
        public final int mAppWidgetId;
        public final RemoteViewsCompatService mContext;
        public Splitter mItems = EMPTY;
        public final int mViewId;

        public RemoteViewsCompatServiceViewFactory(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
            this.mContext = remoteViewsCompatService;
            this.mAppWidgetId = i;
            this.mViewId = i2;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getCount() {
            return ((long[]) this.mItems.trimmer).length;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final long getItemId(int i) {
            try {
                return ((long[]) this.mItems.trimmer)[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final RemoteViews getViewAt(int i) {
            try {
                return ((RemoteViews[]) this.mItems.strategy)[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.mContext.getPackageName(), R.layout.invalid_list_item);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getViewTypeCount() {
            return this.mItems.limit;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final boolean hasStableIds() {
            return this.mItems.omitEmptyStrings;
        }

        public final void loadData() {
            Long l;
            RemoteViewsCompatService remoteViewsCompatService = this.mContext;
            SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
            sharedPreferences.getClass();
            StringBuilder sb = new StringBuilder();
            int i = this.mAppWidgetId;
            sb.append(i);
            sb.append(':');
            sb.append(this.mViewId);
            Splitter splitter = null;
            String string2 = sharedPreferences.getString(sb.toString(), null);
            if (string2 == null) {
                Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
            } else {
                byte[] decode = Base64.decode(string2, 0);
                decode.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                try {
                    obtain.unmarshall(decode, 0, decode.length);
                    obtain.setDataPosition(0);
                    byte[] bArr = new byte[obtain.readInt()];
                    obtain.readByteArray(bArr);
                    String readString = obtain.readString();
                    readString.getClass();
                    long readLong = obtain.readLong();
                    obtain.recycle();
                    if (Intrinsics.areEqual(Build.VERSION.INCREMENTAL, readString)) {
                        try {
                            l = Long.valueOf(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0).getLongVersionCode());
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e);
                            l = null;
                        }
                        if (l == null) {
                            Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                        } else if (l.longValue() != readLong) {
                            Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                        } else {
                            try {
                                obtain = Parcel.obtain();
                                obtain.getClass();
                                try {
                                    obtain.unmarshall(bArr, 0, bArr.length);
                                    obtain.setDataPosition(0);
                                    Splitter splitter2 = new Splitter(obtain);
                                    obtain.recycle();
                                    splitter = splitter2;
                                } finally {
                                }
                            } catch (Throwable th) {
                                Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                            }
                        }
                    } else {
                        Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                    }
                } finally {
                }
            }
            if (splitter == null) {
                splitter = EMPTY;
            }
            this.mItems = splitter;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onCreate() {
            loadData();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDataSetChanged() {
            loadData();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDestroy() {
        }
    }

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new RemoteViewsCompatServiceViewFactory(this, intExtra, intExtra2);
        }
        a$$ExternalSyntheticBUOutline0.m$1("No view id was present in the intent");
        return null;
    }
}
