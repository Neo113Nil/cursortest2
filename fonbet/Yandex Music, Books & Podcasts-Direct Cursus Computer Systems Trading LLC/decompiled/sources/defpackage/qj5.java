package defpackage;

import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Meta;

/* loaded from: classes3.dex */
public final class qj5 implements oj5 {
    public final sv8 a;

    public qj5(sv8 sv8Var) {
        this.a = sv8Var;
    }

    public static qh5 a(InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta) {
        wh5 wh5Var;
        switch (pj5.a[internalCommunicationTrigger$Meta.getUiType().ordinal()]) {
            case 1:
                wh5Var = wh5.c;
                break;
            case 2:
                wh5Var = wh5.d;
                break;
            case 3:
                wh5Var = wh5.e;
                break;
            case 4:
                wh5Var = wh5.f;
                break;
            case 5:
                wh5Var = wh5.g;
                break;
            case 6:
                wh5Var = wh5.h;
                break;
            default:
                b6e.s();
                return null;
        }
        return new qh5(wh5Var, internalCommunicationTrigger$Meta.getHasTabDot(), internalCommunicationTrigger$Meta.getShowAfter(), internalCommunicationTrigger$Meta.getShowBefore());
    }
}
