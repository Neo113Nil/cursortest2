package ru.yandex.taxi.widget.dialog;

import android.app.Activity;
import defpackage.awt;
import defpackage.bh11;
import defpackage.kyh0;
import defpackage.z631;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.h;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/yandex/taxi/widget/dialog/UpdateDialog;", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "Landroid/app/Activity;", "activity", "Lz631;", "vendorAppReviewRouter", "<init>", "(Landroid/app/Activity;Lz631;)V", "rfw0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateDialog extends AlertDialog {
    private UpdateDialog(Activity activity, z631 z631Var) {
        super(activity);
        setMessage(kyh0.update_application_message);
        setPositiveButton(kyh0.update_application_now, new bh11(8, z631Var));
        setNegativeButton(kyh0.update_application_later);
        setCancelableOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(z631 z631Var) {
        awt awtVar = (awt) z631Var;
        h hVar = awtVar.c;
        awtVar.d.getClass();
        hVar.d("ru.yandex.taxi");
    }

    public /* synthetic */ UpdateDialog(Activity activity, z631 z631Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, z631Var);
    }
}
