package defpackage;

import com.yandex.music.shared.playback.api.commands.SetPlaybackSpeedCommand;

/* loaded from: classes4.dex */
public final class xnp implements d3l {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SetPlaybackSpeedCommand setPlaybackSpeedCommand, vx6 vx6Var, cg6 cg6Var) {
        wnp wnpVar;
        int i;
        if (cg6Var instanceof wnp) {
            wnpVar = (wnp) cg6Var;
            int i2 = wnpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wnpVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wnpVar.j;
                nm6 nm6Var = nm6.a;
                i = wnpVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SetPlaybackSpeedCommandsExecutor", "set playbackSpeed=" + setPlaybackSpeedCommand.getPlaybackSpeed(), null);
                    uol uolVar = (uol) vx6Var.d;
                    h4q playbackSpeed = setPlaybackSpeedCommand.getPlaybackSpeed();
                    wnpVar.l = 1;
                    if (uolVar.m(playbackSpeed, wnpVar) == nm6Var) {
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
        wnpVar = new wnp(this, cg6Var);
        Object obj2 = wnpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wnpVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
