package com.connectsdk.service.webos.lgcast.common.utils;

import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.jq;
import defpackage.sr7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public class Logger {
    private static final String TAG = "LGCAST";
    private static ScrollView mScrollView = null;
    private static boolean mShowDebug = true;
    private static TextView mTextView;

    public static void clear() {
        TextView textView = mTextView;
        if (textView != null) {
            textView.post(new jq(3));
        }
    }

    public static void debug(String str, Object... objArr) {
        if (mShowDebug) {
            out(3, StringUtil.format(str, objArr));
        }
    }

    public static void error(Throwable th) {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        out(6, "Exception: " + th.getMessage() + " (" + stackTrace[1].getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTrace[1].getLineNumber() + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clear$0() {
        mTextView.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$out$1() {
        mScrollView.scrollTo(0, mTextView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$out$2(String str) {
        mTextView.append(str + StringUtil.LF);
        mScrollView.post(new jq(2));
    }

    private static void out(int i, String str) {
        TextView textView;
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        String className = stackTraceElement.getClassName();
        String format = String.format("[%s:%d] ", className.substring(className.lastIndexOf(".") + 1), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (i == 2) {
            Log.v(TAG, format + str);
        } else if (i == 3) {
            Log.d(TAG, format + str);
        } else if (i == 6) {
            Log.e(TAG, format + str);
        }
        if (mScrollView == null || (textView = mTextView) == null) {
            return;
        }
        textView.post(new sr7(28, str));
    }

    public static void print(String str, Object... objArr) {
        out(2, StringUtil.format(str, objArr));
    }

    public static void setView(ScrollView scrollView, TextView textView) {
        mScrollView = scrollView;
        mTextView = textView;
    }

    public static void showDebug(boolean z) {
        mShowDebug = z;
    }

    public static void trace(Throwable th) {
        out(6, Log.getStackTraceString(th));
    }

    public static void error(String str, Object... objArr) {
        out(6, StringUtil.format(str, objArr));
    }
}
