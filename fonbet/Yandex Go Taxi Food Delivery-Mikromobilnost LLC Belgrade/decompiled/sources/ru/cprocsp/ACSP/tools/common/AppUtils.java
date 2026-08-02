package ru.cprocsp.ACSP.tools.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.snackbar.c;
import defpackage.bx60;
import defpackage.cz2;
import defpackage.dz2;
import defpackage.n751;
import defpackage.ny61;
import defpackage.u1w;
import defpackage.vng0;
import defpackage.woh0;
import defpackage.x610;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class AppUtils implements Constants {
    public static void errorMessage(FragmentManager fragmentManager, DialogContent dialogContent) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(DialogContent.INTENT_PARAM_DIALOG_CONTENT, dialogContent);
        ErrorMessageDialog errorMessageDialog = new ErrorMessageDialog();
        errorMessageDialog.setArguments(bundle);
        errorMessageDialog.show(fragmentManager, "dialog");
    }

    public static String extractProtocol(String str) {
        Matcher matcher = Pattern.compile("^(([^:?#]+)://)?([/]*([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?").matcher(str);
        if (matcher.find()) {
            return matcher.group(2);
        }
        return null;
    }

    public static String getApplicationLabel(Activity activity, String str) {
        CharSequence applicationLabel;
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null && (applicationLabel = activity.getPackageManager().getApplicationLabel(applicationInfo)) != null) {
                return String.valueOf(applicationLabel);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return str;
    }

    public static String getApplicationVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return null;
        }
    }

    public static Dialog getProgressDialog(Context context) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(woh0.dialog_progress);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return dialog;
    }

    private static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (activity.getCurrentFocus() != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setupUI$0(View view, MotionEvent motionEvent) {
        hideSoftKeyboard((Activity) view.getContext());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showWarning$1(DialogInterface dialogInterface, int i) {
    }

    public static String makeFragmentTag(ViewGroup viewGroup, int i) {
        return "android:switcher:" + viewGroup.getId() + ":" + i;
    }

    public static void setWindowInsets(View view) {
        bx60 bx60Var = new bx60() { // from class: ru.cprocsp.ACSP.tools.common.AppUtils.1
            @Override // defpackage.bx60
            public n751 onApplyWindowInsets(View view2, n751 n751Var) {
                u1w g = n751Var.a.g(647);
                view2.setPadding(g.a, g.b, g.c, g.d);
                return n751.b;
            }
        };
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(view, bx60Var);
    }

    public static void setupUI(View view) {
        int i = 0;
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(new cz2(i));
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            setupUI(viewGroup.getChildAt(i));
            i++;
        }
    }

    public static void showSnackbar(View view, int i) {
        int[] iArr = c.z;
        c.f(view, view.getResources().getText(i)).g();
    }

    public static void showSnackbarError(Context context, View view, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(vng0.colorError, typedValue, true);
        int i2 = typedValue.data;
        int[] iArr = c.z;
        c f = c.f(view, view.getResources().getText(i));
        f.i.setBackgroundTintList(ColorStateList.valueOf(i2));
        f.g();
    }

    public static void showWarning(Context context, String str, String str2) {
        x610 m = new x610(context, 0).m(str2);
        m.a.f = str;
        m.k(new dz2(0)).create().show();
    }

    public static int uid(Activity activity) {
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).applicationInfo.uid;
        } catch (Exception e) {
            ny61.j(e);
            return 0;
        }
    }

    public static void showSnackbar(View view, String str) {
        c.f(view, str).g();
    }

    public static void showSnackbarError(Context context, View view, int i, int i2, String[] strArr) {
        showSnackbarError(context, view, strArr[i - i2]);
    }

    public static void showSnackbarError(Context context, View view, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(vng0.colorError, typedValue, true);
        int i = typedValue.data;
        c f = c.f(view, str);
        f.i.setBackgroundTintList(ColorStateList.valueOf(i));
        f.g();
    }
}
