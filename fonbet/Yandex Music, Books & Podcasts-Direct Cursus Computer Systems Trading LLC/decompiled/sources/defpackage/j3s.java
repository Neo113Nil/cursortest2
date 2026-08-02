package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.t;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j3s implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3s b;

    public /* synthetic */ j3s(l3s l3sVar, int i) {
        this.a = i;
        this.b = l3sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r0 == null) goto L19;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        z3s z3sVar;
        switch (this.a) {
            case 0:
                l3s l3sVar = this.b;
                Parcelable parcelable = l3sVar.requireArguments().getParcelable("arg.tag");
                if (parcelable != null) {
                    d3s d3sVar = (d3s) parcelable;
                    Parcelable[] parcelableArray = l3sVar.requireArguments().getParcelableArray("arg.playlist_ids");
                    if (parcelableArray != null) {
                        List X = xz0.X(parcelableArray);
                        X.getClass();
                        kxi d = l3sVar.d();
                        String string = l3sVar.requireArguments().getString("arg.sort_by");
                        if (string != null) {
                            z3s.b.getClass();
                            z3sVar = jkl.g(string);
                            break;
                        }
                        z3sVar = z3s.d;
                        return new y3s(d3sVar, X, d, z3sVar);
                    }
                    xq0.x("Required value was null.");
                } else {
                    xq0.x("Required value was null.");
                }
                return null;
            case 1:
                l3s l3sVar2 = this.b;
                wjb wjbVar = wjb.MetatagScreen;
                hlb hlbVar = hlb.Fullscreen;
                Parcelable parcelable2 = l3sVar2.requireArguments().getParcelable("arg.tag");
                if (parcelable2 != null) {
                    return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.MetaTag, ((d3s) parcelable2).a), 44);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                l3s l3sVar3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(h3s.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = l3sVar3.requireActivity();
                requireActivity.getClass();
                return new s3s(requireActivity);
        }
    }
}
