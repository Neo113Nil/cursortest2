package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.MenuDialogHelper;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzb;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MonthAdapter;
import com.google.android.material.datepicker.MonthsPagerAdapter;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment$$ExternalSyntheticLambda4;
import com.squareup.cash.R;
import com.squareup.scannerview.CameraOperator;
import com.squareup.workflow1.ui.modal.AlertContainer$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AlertController {
    public ListAdapter mAdapter;
    public final int mAlertDialogLayout;
    public Button mButtonNegative;
    public Message mButtonNegativeMessage;
    public CharSequence mButtonNegativeText;
    public Button mButtonNeutral;
    public Message mButtonNeutralMessage;
    public CharSequence mButtonNeutralText;
    public Button mButtonPositive;
    public Message mButtonPositiveMessage;
    public CharSequence mButtonPositiveText;
    public final Context mContext;
    public View mCustomTitleView;
    public final AlertDialog mDialog;
    public final CameraOperator.AnonymousClass2 mHandler;
    public Drawable mIcon;
    public ImageView mIconView;
    public final int mListItemLayout;
    public final int mListLayout;
    public RecycleListView mListView;
    public CharSequence mMessage;
    public TextView mMessageView;
    public NestedScrollView mScrollView;
    public final boolean mShowTitle;
    public final int mSingleChoiceItemLayout;
    public CharSequence mTitle;
    public TextView mTitleView;
    public View mView;
    public int mViewLayoutResId;
    public final Window mWindow;
    public boolean mViewSpacingSpecified = false;
    public int mCheckedItem = -1;
    public final Toolbar.AnonymousClass4 mButtonHandler = new Toolbar.AnonymousClass4(this, 1);

    public final class AlertParams {
        public ListAdapter mAdapter;
        public final ContextThemeWrapper mContext;
        public View mCustomTitleView;
        public Drawable mIcon;
        public final LayoutInflater mInflater;
        public boolean mIsSingleChoice;
        public CharSequence mMessage;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public NfcReaderFragment$$ExternalSyntheticLambda4 mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public AlertContainer$$ExternalSyntheticLambda0 mOnCancelListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public MenuDialogHelper mOnKeyListener;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mCheckedItem = -1;
        public boolean mCancelable = true;

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$3, reason: invalid class name */
        public final class AnonymousClass3 implements AdapterView.OnItemClickListener {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Object this$0;
            public final /* synthetic */ Object val$dialog;

            public /* synthetic */ AnonymousClass3(int i, Object obj, Object obj2) {
                this.$r8$classId = i;
                this.this$0 = obj;
                this.val$dialog = obj2;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                int i2 = this.$r8$classId;
                Object obj = this.this$0;
                Object obj2 = this.val$dialog;
                switch (i2) {
                    case 0:
                        AlertParams alertParams = (AlertParams) obj;
                        AlertController alertController = (AlertController) obj2;
                        alertParams.mOnClickListener.onClick(alertController.mDialog, i);
                        if (!alertParams.mIsSingleChoice) {
                            alertController.mDialog.dismiss();
                            break;
                        }
                        break;
                    default:
                        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj2;
                        MonthAdapter adapter = materialCalendarGridView.getAdapter();
                        if (i >= adapter.firstPositionInMonth() && i <= adapter.lastPositionInMonth()) {
                            zzb zzbVar = ((MonthsPagerAdapter) obj).onDayClickListener;
                            Long item = materialCalendarGridView.getAdapter().getItem(i);
                            long longValue = item.longValue();
                            MaterialCalendar materialCalendar = (MaterialCalendar) zzbVar.zza;
                            if (materialCalendar.calendarConstraints.validator.isValid(longValue)) {
                                materialCalendar.dateSelector.selectedItem = item;
                                Iterator it = materialCalendar.onSelectionChangedListeners.iterator();
                                while (it.hasNext()) {
                                    ((MaterialDatePicker.AnonymousClass2) it.next()).onSelectionChanged(materialCalendar.dateSelector.selectedItem);
                                }
                                materialCalendar.recyclerView.mAdapter.notifyDataSetChanged();
                                RecyclerView recyclerView = materialCalendar.yearSelector;
                                if (recyclerView != null) {
                                    recyclerView.mAdapter.notifyDataSetChanged();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }

        public AlertParams(ContextThemeWrapper contextThemeWrapper) {
            this.mContext = contextThemeWrapper;
            this.mInflater = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public final class CheckedItemAdapter extends ArrayAdapter {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AlertDialog alertDialog, Window window) {
        this.mContext = context;
        this.mDialog = alertDialog;
        this.mWindow = window;
        CameraOperator.AnonymousClass2 anonymousClass2 = new CameraOperator.AnonymousClass2();
        anonymousClass2.this$0 = new WeakReference(alertDialog);
        this.mHandler = anonymousClass2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.mAlertDialogLayout = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.mListLayout = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.mSingleChoiceItemLayout = obtainStyledAttributes.getResourceId(7, 0);
        this.mListItemLayout = obtainStyledAttributes.getResourceId(3, 0);
        this.mShowTitle = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        alertDialog.getDelegate().requestWindowFeature(1);
    }

    public static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup resolvePanel(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.mHandler.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.mButtonNeutralText = charSequence;
            this.mButtonNeutralMessage = obtainMessage;
        } else if (i == -2) {
            this.mButtonNegativeText = charSequence;
            this.mButtonNegativeMessage = obtainMessage;
        } else if (i != -1) {
            a$$ExternalSyntheticBUOutline0.m$3("Button does not exist");
        } else {
            this.mButtonPositiveText = charSequence;
            this.mButtonPositiveMessage = obtainMessage;
        }
    }

    public class RecycleListView extends ListView {
        public final int mPaddingBottomNoButtons;
        public final int mPaddingTopNoTitle;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
            this.mPaddingBottomNoButtons = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.mPaddingTopNoTitle = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.mPaddingTopNoTitle, getPaddingRight(), z2 ? getPaddingBottom() : this.mPaddingBottomNoButtons);
        }

        public RecycleListView(Context context) {
            this(context, null);
        }
    }
}
