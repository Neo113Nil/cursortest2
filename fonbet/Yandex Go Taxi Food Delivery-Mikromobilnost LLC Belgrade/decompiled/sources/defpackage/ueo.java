package defpackage;

import com.yandex.plus.experiments.impl.providers.a;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.io.b;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes8.dex */
public final /* synthetic */ class ueo implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ ueo(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                return (b3u0) slsVar.invoke();
            case 1:
                try {
                    return (List) slsVar.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.a;
                }
            case 2:
                Object h = ((a) ((PropertyReference0) slsVar).get()).h();
                return (k2d0) (h instanceof Result.Failure ? null : h);
            case 3:
                Object h2 = ((a) ((PropertyReference0) slsVar).get()).h();
                return (k2d0) (h2 instanceof Result.Failure ? null : h2);
            case 4:
                File file = (File) slsVar.invoke();
                if (b.m(file).equals("preferences_pb")) {
                    return file.getAbsoluteFile();
                }
                yci0.n("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
                return null;
            default:
                return new zzy0(slsVar);
        }
    }
}
