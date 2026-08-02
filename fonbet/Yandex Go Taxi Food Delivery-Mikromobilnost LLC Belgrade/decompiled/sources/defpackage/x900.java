package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.main_screen.data.DocumentSourceVariableFactory$Companion$DocumentSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class x900 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa00 b;

    public /* synthetic */ x900(aa00 aa00Var, int i) {
        this.a = i;
        this.b = aa00Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        aa00 aa00Var = this.b;
        switch (i) {
            case 0:
                DocumentSourceVariableFactory$Companion$DocumentSource documentSourceVariableFactory$Companion$DocumentSource = (DocumentSourceVariableFactory$Companion$DocumentSource) obj;
                a aVar = aa00Var.R;
                c231 g = aVar.g("superapp.document_source");
                if (g != null) {
                    g.g(documentSourceVariableFactory$Companion$DocumentSource.getSource());
                    aVar.i(g);
                    break;
                }
                break;
            case 1:
                long longValue = ((Number) obj).longValue();
                a aVar2 = aa00Var.R;
                y131 y131Var = (y131) aVar2.g("superapp.header_height");
                y131Var.j(longValue);
                aVar2.i(y131Var);
                break;
            case 2:
                String str = (String) obj;
                a aVar3 = aa00Var.R;
                c231 g2 = aVar3.g("superapp.loading_inapp_state");
                if (g2 != null) {
                    g2.g(str);
                    aVar3.i(g2);
                    break;
                }
                break;
            default:
                String str2 = (String) obj;
                a aVar4 = aa00Var.R;
                c231 g3 = aVar4.g("loadingSnippetState");
                if (g3 != null) {
                    g3.g(str2);
                    aVar4.i(g3);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, aa00.class, "updateDocumentSource", "updateDocumentSource(Lcom/yandex/go/flex/main_screen/data/DocumentSourceVariableFactory$Companion$DocumentSource;)V", 4);
            case 1:
                return new AdaptedFunctionReference(2, this.b, aa00.class, "updateSuperappHeaderHeightVariable", "updateSuperappHeaderHeightVariable$impl(J)V", 4);
            case 2:
                return new AdaptedFunctionReference(2, this.b, aa00.class, "updateLoadingInAppState", "updateLoadingInAppState(Ljava/lang/String;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, aa00.class, "updateLoadingSnippetState", "updateLoadingSnippetState(Ljava/lang/String;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
