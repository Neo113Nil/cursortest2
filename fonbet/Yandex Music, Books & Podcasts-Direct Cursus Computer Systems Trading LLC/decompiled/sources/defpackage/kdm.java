package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class kdm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ldm b;

    public /* synthetic */ kdm(ldm ldmVar, int i) {
        this.a = i;
        this.b = ldmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                ldm ldmVar = this.b;
                wjb wjbVar = wjb.DynamicScreen;
                hlb hlbVar = hlb.Fullscreen;
                Parcelable parcelable = ldmVar.requireArguments().getParcelable("arg.args");
                if (parcelable != null) {
                    mem memVar = (mem) parcelable;
                    int ordinal = memVar.b.ordinal();
                    if (ordinal == 0) {
                        str = "nonmusic";
                    } else if (ordinal == 1) {
                        str = "kids";
                    } else {
                        b6e.s();
                    }
                    int ordinal2 = memVar.a.ordinal();
                    if (ordinal2 == 0) {
                        str2 = "category";
                    } else if (ordinal2 == 1) {
                        str2 = "editorial_albums";
                    } else if (ordinal2 == 2) {
                        str2 = "editorial_playlists";
                    } else if (ordinal2 == 3) {
                        str2 = "compilations";
                    } else {
                        b6e.s();
                    }
                    return new cvo(wjbVar, hlbVar, (glb) null, new dvo(str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + memVar.c), (avo) null, 52);
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                Parcelable parcelable2 = this.b.requireArguments().getParcelable("arg.args");
                if (parcelable2 != null) {
                    return new efm((mem) parcelable2);
                }
                xq0.x("Required value was null.");
                return null;
            case 2:
                ldm ldmVar2 = this.b;
                return new scm(ldmVar2.g.m(), ldmVar2.getL());
            default:
                ldm ldmVar3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(hdm.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = ldmVar3.requireActivity();
                requireActivity.getClass();
                return new ncm(requireActivity);
        }
    }
}
