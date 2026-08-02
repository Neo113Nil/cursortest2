package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final /* synthetic */ class yas implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl b;

    public /* synthetic */ yas(Object obj, sl slVar, int i) {
        this.a = i;
        this.b = slVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        sl slVar = this.b;
        switch (i) {
            case 0:
                return was.a((was) obj, null, new nas(slVar), null, false, HProv.PP_PASSWD_TERM);
            default:
                return lm01.a((lm01) obj, null, new gcq0(slVar), 27);
        }
    }
}
