package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class qul implements eg90 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ qul(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        StackTraceElement stackTraceElement;
        String str;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((eg90) ((i3y) obj).getValue()).a(exc);
                break;
            default:
                zjr zjrVar = (zjr) obj;
                String type = ErrorTypes.DIVKIT_TEMPLATE_DECODING_ERROR.getType();
                i3y a = xfz.a(new Pair("locator", "DivkitTemplatesSharedDataParser.tryParse"), new Pair("cause", exc), xfz.d(exc.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                i3y a2 = xfz.a(new Pair("errorType", type));
                tjr tjrVar2 = tjrVar;
                zjrVar.d(FlexLogLevel.ERROR, "DivKitTemplate decoding error", xfz.c(a, a2), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                break;
        }
    }

    @Override // defpackage.eg90
    public final void b(Exception exc, String str) {
        StackTraceElement stackTraceElement;
        String str2;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((eg90) ((i3y) obj).getValue()).b(exc, str);
                break;
            default:
                zjr zjrVar = (zjr) obj;
                String type = ErrorTypes.DIVKIT_TEMPLATE_DECODING_ERROR.getType();
                i3y a = xfz.a(new Pair("locator", "DivkitTemplatesSharedDataParser.tryParse"), new Pair("cause", exc), xfz.d(exc.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION), new Pair("templateId", str));
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str2 = valueOf.toString()) == null) {
                        str2 = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str2);
                }
                i3y a2 = xfz.a(new Pair("errorType", type));
                zjrVar.d(FlexLogLevel.ERROR, "DivKitTemplate decoding error", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
        }
    }
}
