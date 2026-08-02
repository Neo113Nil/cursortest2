package defpackage;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class zv61 extends xw61 implements bw61 {
    public final cr80 x;

    public zv61(Node node, String str, String str2, String str3) {
        super(node, str, str2, str3);
        this.x = null;
        JCPLogger.subEnter();
        if (this.x == null) {
            Element f = f("Cert");
            if (f == null) {
                return;
            }
            try {
                this.x = rv61.h(new rv61(f, this.b, this.c, this.w));
            } catch (Exception e) {
                JCPLogger.thrown(e);
            }
        }
        JCPLogger.subExit();
    }

    @Override // defpackage.bw61
    public final cr80 a() {
        return this.x;
    }
}
