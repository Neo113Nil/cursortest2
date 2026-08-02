package ru.yandex.taxi.widget.dialog;

import android.app.Activity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\u0006\u001a\u00020\u00002\f\b\u0001\u0010\u0007\u001a\u00020\f:\u0002\b\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u0006\u001a\u00020\u00002\f\b\u0001\u0010\u0007\u001a\u00020\f:\u0002\b\r2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u0006\u001a\u00020\u00002\f\b\u0001\u0010\u0007\u001a\u00020\f:\u0002\b\rJ\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\u000e\u001a\u00020\u00002\f\b\u0001\u0010\u0007\u001a\u00020\f:\u0002\b\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u000e\u001a\u00020\u00002\f\b\u0001\u0010\u0007\u001a\u00020\f:\u0002\b\r2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u000e\u001a\u00020\u00002\f\b\u0001\u0010\u0007\u001a\u00020\f:\u0002\b\r¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/widget/dialog/AlertDialog;", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "setPositiveButton", "text", "", "listener", "Ljava/lang/Runnable;", "analyticsName", "", "Landroidx/annotation/StringRes;", "setNegativeButton", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AlertDialog extends BaseDialog<AlertDialog> {
    public AlertDialog(Activity activity) {
        super(activity);
    }

    public final AlertDialog setNegativeButton(String text, Runnable listener) {
        return addButton(text, listener, (String) null);
    }

    public final AlertDialog setPositiveButton(String text, Runnable listener) {
        return setMainActionButton(text, listener, (String) null);
    }

    public final AlertDialog setNegativeButton(String text, Runnable listener, String analyticsName) {
        return addButton(text, listener, analyticsName);
    }

    public final AlertDialog setPositiveButton(String text, Runnable listener, String analyticsName) {
        return setMainActionButton(text, listener, analyticsName);
    }

    public final AlertDialog setNegativeButton(String text) {
        return setNegativeButton(text, (Runnable) null);
    }

    public final AlertDialog setPositiveButton(String text) {
        return setPositiveButton(text, (Runnable) null);
    }

    public final AlertDialog setNegativeButton(int text, Runnable listener, String analyticsName) {
        return addButton(text, listener, analyticsName);
    }

    public final AlertDialog setPositiveButton(int text, Runnable listener, String analyticsName) {
        return setMainActionButton(text, listener, analyticsName);
    }

    public final AlertDialog setNegativeButton(int text, Runnable listener) {
        return addButton(text, listener, (String) null);
    }

    public final AlertDialog setPositiveButton(int text, Runnable listener) {
        return setMainActionButton(text, listener, (String) null);
    }

    public final AlertDialog setNegativeButton(int text) {
        return setNegativeButton(text, (Runnable) null);
    }

    public final AlertDialog setPositiveButton(int text) {
        return setPositiveButton(text, (Runnable) null);
    }
}
