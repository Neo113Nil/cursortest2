package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes11.dex */
public final /* synthetic */ class w591 implements ip60 {
    public static final /* synthetic */ w591 b = new w591(0);
    public static final /* synthetic */ w591 c = new w591(1);
    public static final /* synthetic */ w591 d = new w591(2);
    public static final /* synthetic */ w591 e = new w591(3);
    public static final /* synthetic */ w591 f = new w591(4);
    public static final /* synthetic */ w591 g = new w591(5);
    public final /* synthetic */ int a;

    public /* synthetic */ w591(int i) {
        this.a = i;
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                jp60 jp60Var = (jp60) obj2;
                jp60Var.f(b691.g, entry.getKey());
                jp60Var.f(b691.h, entry.getValue());
                return;
            case 1:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                jp60 jp60Var2 = (jp60) obj2;
                jp60Var2.f(sd91.g, entry2.getKey());
                jp60Var2.f(sd91.h, entry2.getValue());
                return;
            case 3:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                jp60 jp60Var3 = (jp60) obj2;
                jp60Var3.f(yf91.g, entry3.getKey());
                jp60Var3.f(yf91.h, entry3.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
