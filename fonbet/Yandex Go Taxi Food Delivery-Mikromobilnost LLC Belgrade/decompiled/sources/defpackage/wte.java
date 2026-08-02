package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.r;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wte {
    public static final /* synthetic */ int c = 0;
    public final CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto a;
    public final Map b;

    static {
        r rVar = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto.Companion;
    }

    public wte(CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto employeeAccessInfoModalDto, Map map) {
        this.a = employeeAccessInfoModalDto;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wte)) {
            return false;
        }
        wte wteVar = (wte) obj;
        return jl40.l(this.a, wteVar.a) && jl40.l(this.b, wteVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(modalDto=" + this.a + ", l10n=" + this.b + Extension.C_BRAKE;
    }
}
