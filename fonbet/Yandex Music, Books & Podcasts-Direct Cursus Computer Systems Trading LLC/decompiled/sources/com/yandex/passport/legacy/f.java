package com.yandex.passport.legacy;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.x;
import defpackage.hrg;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class f {
    public static void a(Context context, ProgressBar progressBar, int i) {
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(context.getColor(i)));
    }

    public static int b(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static String c(Context context, x xVar, boolean z) {
        String str = xVar.k;
        return (str == null || TextUtils.isEmpty(str)) ? context.getString(R.string.passport_eula_user_agreement_url) : g(str, z);
    }

    public static String d(Context context, x xVar, boolean z) {
        String str = xVar.l;
        return (str == null || TextUtils.isEmpty(str)) ? context.getString(R.string.passport_eula_privacy_policy_url) : g(str, z);
    }

    public static String e(String str) {
        return hrg.q("<b>", str, "</b>");
    }

    public static String f(String str, String str2) {
        return hrg.s("<a href='", str, "'>", str2, "</a>");
    }

    public static String g(String str, boolean z) {
        Uri parse = Uri.parse(str.toLowerCase(Locale.US));
        Uri.Builder fragment = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath()).fragment(parse.getFragment());
        if (z) {
            fragment.encodedQuery(parse.getEncodedQuery());
        } else {
            fragment.query(parse.getQuery());
        }
        return fragment.build().toString();
    }

    public static void h(int i, View view) {
        if (view instanceof ProgressBar) {
            a(view.getContext(), (ProgressBar) view, i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(i, viewGroup.getChildAt(i2));
            }
        }
    }

    public static void i(TextView textView, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = b(textView.getContext(), i);
        textView.setLayoutParams(marginLayoutParams);
    }
}
