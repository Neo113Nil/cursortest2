package ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification;

import defpackage.aw7;
import defpackage.bw7;
import defpackage.ck70;
import defpackage.cw7;
import defpackage.ds0;
import defpackage.jk70;
import defpackage.w511;
import defpackage.wls;
import defpackage.xv7;
import defpackage.yv7;
import defpackage.zv7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class OrderCancelClarificationKt$OrderCancelClarification$1$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        cw7 cw7Var = (cw7) obj;
        String str = (String) obj2;
        jk70 jk70Var = (jk70) this.receiver;
        ds0 ds0Var = jk70Var.w;
        ck70 ck70Var = jk70Var.c;
        if (cw7Var instanceof yv7) {
            ds0Var.a(str, "cancel");
            ck70Var.getClass();
        } else if (cw7Var instanceof xv7) {
            ds0Var.a(str, "primary_button");
            ck70Var.b.invoke(((xv7) cw7Var).a);
        } else if (cw7Var instanceof aw7) {
            ds0Var.a(str, "call_courier");
            ck70Var.c.invoke(((aw7) cw7Var).b);
        } else if (cw7Var instanceof zv7) {
            ds0Var.a(str, "chat_courier");
            ck70Var.w.invoke((zv7) cw7Var);
        } else if (!(cw7Var instanceof bw7)) {
            w511.b();
            return null;
        }
        ck70Var.a.dismiss();
        return zy11.a;
    }
}
