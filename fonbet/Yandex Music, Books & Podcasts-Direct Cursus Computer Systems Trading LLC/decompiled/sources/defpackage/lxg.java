package defpackage;

import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.exo.a;
import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lxg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public int m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxg(Object obj, Object obj2, int i, int i2, Object obj3, Continuation continuation, int i3) {
        super(2, continuation);
        this.j = i3;
        this.n = obj;
        this.o = obj2;
        this.l = i;
        this.m = i2;
        this.p = obj3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new lxg((zxg) this.n, (r2f) this.o, this.l, this.m, (qxg) this.p, continuation, 0);
            case 1:
                return new lxg((a) this.n, (byte[]) this.o, this.l, this.m, (IOException) this.p, continuation, 1);
            case 2:
                return new lxg((a) this.n, (byte[]) this.o, this.l, this.m, (DoNotRetryException) this.p, continuation, 2);
            case 3:
                return new lxg((cus) this.o, (String) this.p, continuation, 3);
            default:
                lxg lxgVar = new lxg((i2u) this.o, (act) this.p, continuation, 4);
                lxgVar.n = obj;
                return lxgVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((lxg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((lxg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((lxg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((lxg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((lxg) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0288  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxg(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.p = obj2;
    }
}
