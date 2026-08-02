package defpackage;

import com.yandex.music.shared.playback.api.commands.SetVolumeCommand;

/* loaded from: classes4.dex */
public final class oop implements d3l {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SetVolumeCommand setVolumeCommand, vx6 vx6Var, cg6 cg6Var) {
        nop nopVar;
        int i;
        if (cg6Var instanceof nop) {
            nopVar = (nop) cg6Var;
            int i2 = nopVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nopVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nopVar.j;
                nm6 nm6Var = nm6.a;
                i = nopVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SetVolumeCommandsExecutor", "set volume=" + setVolumeCommand.getVolume(), null);
                    uol uolVar = (uol) vx6Var.d;
                    n4q volume = setVolumeCommand.getVolume();
                    nopVar.l = 1;
                    if (uolVar.n(volume, nopVar) == nm6Var) {
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
        nopVar = new nop(this, cg6Var);
        Object obj2 = nopVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nopVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
