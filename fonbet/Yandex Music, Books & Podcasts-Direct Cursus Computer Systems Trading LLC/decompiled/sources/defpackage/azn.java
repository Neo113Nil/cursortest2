package defpackage;

import com.yandex.music.shared.playback.api.commands.ReplayCommand;

/* loaded from: classes4.dex */
public final class azn implements d3l {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ReplayCommand replayCommand, vx6 vx6Var, cg6 cg6Var) {
        zyn zynVar;
        int i;
        if (cg6Var instanceof zyn) {
            zynVar = (zyn) cg6Var;
            int i2 = zynVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zynVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zynVar.j;
                nm6 nm6Var = nm6.a;
                i = zynVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "ReplayCommandsExecutor", "replay", null);
                    kun kunVar = new kun((uol) vx6Var.d, this, replayCommand, null, 3);
                    bsd b = dm6.b();
                    zynVar.l = 1;
                    if (x97.V(b, kunVar, zynVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.TRUE;
            }
        }
        zynVar = new zyn(this, cg6Var);
        Object obj2 = zynVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zynVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
