package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.MenuDialogHelper;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AlertDialog extends AppCompatDialog implements DialogInterface {
    public final AlertController mAlert;

    public AlertDialog(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, resolveDialogTheme(contextThemeWrapper, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.mAlert;
        alertController.mDialog.setContentView(alertController.mAlertDialogLayout);
        Context context = alertController.mContext;
        Window window = alertController.mWindow;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = alertController.mView;
        if (view == null) {
            view = alertController.mViewLayoutResId != 0 ? LayoutInflater.from(context).inflate(alertController.mViewLayoutResId, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !AlertController.canTextInput(view)) {
            window.setFlags(PKIFailureInfo.unsupportedVersion, PKIFailureInfo.unsupportedVersion);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.mViewSpacingSpecified) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.mListView != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = RecyclerView.DECELERATION_RATE;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup resolvePanel = AlertController.resolvePanel(findViewById6, findViewById3);
        ViewGroup resolvePanel2 = AlertController.resolvePanel(findViewById7, findViewById4);
        ViewGroup resolvePanel3 = AlertController.resolvePanel(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.mScrollView = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.mScrollView.setNestedScrollingEnabled(false);
        TextView textView = (TextView) resolvePanel2.findViewById(android.R.id.message);
        alertController.mMessageView = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.mMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.mScrollView.removeView(alertController.mMessageView);
                if (alertController.mListView != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.mScrollView.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.mScrollView);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.mListView, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    resolvePanel2.setVisibility(8);
                }
            }
        }
        Button button = (Button) resolvePanel3.findViewById(android.R.id.button1);
        alertController.mButtonPositive = button;
        Toolbar.AnonymousClass4 anonymousClass4 = alertController.mButtonHandler;
        button.setOnClickListener(anonymousClass4);
        boolean isEmpty = TextUtils.isEmpty(alertController.mButtonPositiveText);
        Button button2 = alertController.mButtonPositive;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(alertController.mButtonPositiveText);
            alertController.mButtonPositive.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) resolvePanel3.findViewById(android.R.id.button2);
        alertController.mButtonNegative = button3;
        button3.setOnClickListener(anonymousClass4);
        boolean isEmpty2 = TextUtils.isEmpty(alertController.mButtonNegativeText);
        Button button4 = alertController.mButtonNegative;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(alertController.mButtonNegativeText);
            alertController.mButtonNegative.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) resolvePanel3.findViewById(android.R.id.button3);
        alertController.mButtonNeutral = button5;
        button5.setOnClickListener(anonymousClass4);
        boolean isEmpty3 = TextUtils.isEmpty(alertController.mButtonNeutralText);
        Button button6 = alertController.mButtonNeutral;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(alertController.mButtonNeutralText);
            alertController.mButtonNeutral.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = alertController.mButtonPositive;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = alertController.mButtonNegative;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = alertController.mButtonNeutral;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            resolvePanel3.setVisibility(8);
        }
        if (alertController.mCustomTitleView != null) {
            resolvePanel.addView(alertController.mCustomTitleView, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.mIconView = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(alertController.mTitle) || !alertController.mShowTitle) {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.mIconView.setVisibility(8);
                resolvePanel.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.mTitleView = textView2;
                textView2.setText(alertController.mTitle);
                Drawable drawable = alertController.mIcon;
                if (drawable != null) {
                    alertController.mIconView.setImageDrawable(drawable);
                } else {
                    alertController.mTitleView.setPadding(alertController.mIconView.getPaddingLeft(), alertController.mIconView.getPaddingTop(), alertController.mIconView.getPaddingRight(), alertController.mIconView.getPaddingBottom());
                    alertController.mIconView.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (resolvePanel == null || resolvePanel.getVisibility() == 8) ? 0 : 1;
        boolean z4 = resolvePanel3.getVisibility() != 8;
        if (!z4 && (findViewById = resolvePanel2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView2 = alertController.mScrollView;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.mMessage == null && alertController.mListView == null) ? null : resolvePanel.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = resolvePanel2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.mListView;
        if (recycleListView != null) {
            recycleListView.setHasDecor(z3, z4);
        }
        if (!z2) {
            View view2 = alertController.mListView;
            if (view2 == null) {
                view2 = alertController.mScrollView;
            }
            if (view2 != null) {
                int i2 = z4 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view2.setScrollIndicators(z3 | i2, 3);
                if (findViewById11 != null) {
                    resolvePanel2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    resolvePanel2.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.mListView;
        if (recycleListView2 == null || (listAdapter = alertController.mAdapter) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i3 = alertController.mCheckedItem;
        if (i3 > -1) {
            recycleListView2.setItemChecked(i3, true);
            recycleListView2.setSelection(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.mScrollView;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.mScrollView;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.mAlert;
        alertController.mTitle = charSequence;
        TextView textView = alertController.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public class Builder {
        public final AlertController.AlertParams P;
        public final int mTheme;

        public Builder(Context context, int i) {
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public AlertDialog create() {
            AlertController.AlertParams alertParams = this.P;
            AlertDialog alertDialog = new AlertDialog(alertParams.mContext, this.mTheme);
            View view = alertParams.mCustomTitleView;
            AlertController alertController = alertDialog.mAlert;
            int i = 0;
            if (view != null) {
                alertController.mCustomTitleView = view;
            } else {
                CharSequence charSequence = alertParams.mTitle;
                if (charSequence != null) {
                    alertController.mTitle = charSequence;
                    TextView textView = alertController.mTitleView;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.mIcon;
                if (drawable != null) {
                    alertController.mIcon = drawable;
                    ImageView imageView = alertController.mIconView;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.mIconView.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = alertParams.mMessage;
            if (charSequence2 != null) {
                alertController.mMessage = charSequence2;
                TextView textView2 = alertController.mMessageView;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = alertParams.mPositiveButtonText;
            if (charSequence3 != null) {
                alertController.setButton(-1, charSequence3, alertParams.mPositiveButtonListener);
            }
            CharSequence charSequence4 = alertParams.mNegativeButtonText;
            if (charSequence4 != null) {
                alertController.setButton(-2, charSequence4, alertParams.mNegativeButtonListener);
            }
            CharSequence charSequence5 = alertParams.mNeutralButtonText;
            if (charSequence5 != null) {
                alertController.setButton(-3, charSequence5, alertParams.mNeutralButtonListener);
            }
            if (alertParams.mAdapter != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertParams.mInflater.inflate(alertController.mListLayout, (ViewGroup) null);
                int i2 = alertParams.mIsSingleChoice ? alertController.mSingleChoiceItemLayout : alertController.mListItemLayout;
                ListAdapter listAdapter = alertParams.mAdapter;
                if (listAdapter == null) {
                    listAdapter = new AlertController.CheckedItemAdapter(alertParams.mContext, i2, android.R.id.text1, null);
                }
                alertController.mAdapter = listAdapter;
                alertController.mCheckedItem = alertParams.mCheckedItem;
                if (alertParams.mOnClickListener != null) {
                    recycleListView.setOnItemClickListener(new AlertController.AlertParams.AnonymousClass3(i, alertParams, alertController));
                }
                if (alertParams.mIsSingleChoice) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.mListView = recycleListView;
            }
            View view2 = alertParams.mView;
            if (view2 != null) {
                alertController.mView = view2;
                alertController.mViewLayoutResId = 0;
                alertController.mViewSpacingSpecified = false;
            } else {
                int i3 = alertParams.mViewLayoutResId;
                if (i3 != 0) {
                    alertController.mView = null;
                    alertController.mViewLayoutResId = i3;
                    alertController.mViewSpacingSpecified = false;
                }
            }
            alertDialog.setCancelable(alertParams.mCancelable);
            if (alertParams.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(alertParams.mOnCancelListener);
            alertDialog.setOnDismissListener(alertParams.mOnDismissListener);
            MenuDialogHelper menuDialogHelper = alertParams.mOnKeyListener;
            if (menuDialogHelper != null) {
                alertDialog.setOnKeyListener(menuDialogHelper);
            }
            return alertDialog;
        }

        public Context getContext() {
            return this.P.mContext;
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            return this;
        }

        public final AlertDialog show() {
            AlertDialog create = create();
            create.show();
            return create;
        }

        public Builder(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }
    }
}
