package defpackage;

import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qap implements d3l {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r9.c(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SeekToPositionCommand seekToPositionCommand, vx6 vx6Var, cg6 cg6Var) {
        pap papVar;
        int i;
        if (cg6Var instanceof pap) {
            papVar = (pap) cg6Var;
            int i2 = papVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                papVar.l = i2 - Integer.MIN_VALUE;
                Object obj = papVar.j;
                nm6 nm6Var = nm6.a;
                i = papVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean C = p6g.C((e6l) ((f7l) vx6Var.b).d.getValue());
                    uol uolVar = (uol) vx6Var.d;
                    if (C) {
                        papVar.l = 1;
                    } else {
                        long position = seekToPositionCommand.getPosition();
                        ssg.a(3, "SeekToPositionCommandsExecutor", dfi.d(position, "seek to position="), null);
                        x9p x9pVar = new x9p(uolVar, position, (Continuation) null);
                        bsd b = dm6.b();
                        papVar.l = 2;
                        Object V = x97.V(b, x9pVar, papVar);
                        if (V != nm6Var) {
                            return V;
                        }
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                return Boolean.TRUE;
            }
        }
        papVar = new pap(this, cg6Var);
        Object obj2 = papVar.j;
        nm6 nm6Var2 = nm6.a;
        i = papVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
