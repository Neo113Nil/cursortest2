package defpackage;

import com.yandex.div.core.expression.local.b;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class tvo implements rvo {
    public final String b;
    public final b c;
    public final f231 d;
    public final mdo e;
    public final l6o f;
    public final String g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k;

    public tvo(String str, b bVar, f231 f231Var, mdo mdoVar, l6o l6oVar, String str2) {
        this.b = str;
        this.c = bVar;
        this.d = f231Var;
        this.e = mdoVar;
        this.f = l6oVar;
        this.g = str2;
    }

    @Override // defpackage.rvo
    public final f1k a(String str, List list, sls slsVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            LinkedHashMap linkedHashMap = this.i;
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(str2, obj);
            }
            ((Set) obj).add(str);
        }
        LinkedHashMap linkedHashMap2 = this.j;
        Object obj2 = linkedHashMap2.get(str);
        if (obj2 == null) {
            obj2 = new br60();
            linkedHashMap2.put(str, obj2);
        }
        ((br60) obj2).a(slsVar);
        return new svo(0, this, str, slsVar);
    }

    @Override // defpackage.rvo
    public final Object b(String str, String str2, jdo jdoVar, tls tlsVar, r131 r131Var, vm11 vm11Var, eg90 eg90Var) {
        try {
            return f(str, str2, jdoVar, tlsVar, r131Var, vm11Var);
        } catch (ParsingException e) {
            if (e.getReason() == ParsingExceptionReason.MISSING_VARIABLE) {
                if (this.k) {
                    throw fg90.a;
                }
                throw e;
            }
            eg90Var.a(e);
            this.f.e(e);
            return this.f(str, str2, jdoVar, tlsVar, r131Var, vm11Var);
        }
    }

    @Override // defpackage.rvo
    public final void c(ParsingException parsingException) {
        this.f.e(parsingException);
    }

    public final String d(String str) {
        String str2 = this.b;
        if (str2.length() == 0) {
            return str;
        }
        return str2 + '/' + str;
    }

    public final Object e(String str, jdo jdoVar) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        Object b = this.e.b(jdoVar);
        if (jdoVar.b) {
            for (String str2 : jdoVar.c()) {
                LinkedHashMap linkedHashMap2 = this.i;
                Object obj2 = linkedHashMap2.get(str2);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap2.put(str2, obj2);
                }
                ((Set) obj2).add(str);
            }
            linkedHashMap.put(str, b);
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(String str, String str2, jdo jdoVar, tls tlsVar, r131 r131Var, vm11 vm11Var) {
        try {
            Object e = e(str2, jdoVar);
            if (!vm11Var.t(e)) {
                if (tlsVar != null) {
                    try {
                        r1 = tlsVar.invoke(e);
                    } catch (ClassCastException e2) {
                        throw fg90.k(str, str2, e, e2);
                    } catch (Exception e3) {
                        ParsingException parsingException = fg90.a;
                        throw new ParsingException(ParsingExceptionReason.INVALID_VALUE, qv10.r(b64.v("Field '", str, "' with expression '", str2, "' received wrong value: '"), e, '\''), e3, null, null, 24);
                    }
                } else if (e != null) {
                    r1 = e;
                }
                if (r1 != null && (vm11Var.q() instanceof String) && !vm11Var.t(r1)) {
                    r1 = String.valueOf(r1);
                }
                if (r1 == null) {
                    ParsingException parsingException2 = fg90.a;
                    ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
                    StringBuilder sb = new StringBuilder("Value '");
                    sb.append(fg90.j(e));
                    sb.append("' for key '");
                    sb.append(str);
                    sb.append("' at path '");
                    throw new ParsingException(parsingExceptionReason, oyr.t(sb, str2, "' is not valid"), null, null, null, 28);
                }
                e = r1;
            }
            try {
                if (r131Var.l(e)) {
                    return e;
                }
                throw fg90.c(e, str2);
            } catch (ClassCastException e4) {
                throw fg90.k(str, str2, e, e4);
            }
        } catch (EvaluableException e5) {
            r1 = e5 instanceof MissingVariableException ? ((MissingVariableException) e5).getVariableName() : null;
            if (r1 == null) {
                throw fg90.i(str, str2, e5);
            }
            ParsingException parsingException3 = fg90.a;
            throw new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, b64.l("Variable '", r1, "' is missing. Expression: ", str2), e5, null, null, 24);
        }
    }

    public final tvo g(String str, uxd uxdVar) {
        e231 e231Var = new e231(this.d, uxdVar);
        String d = d(str);
        cxq0 cxq0Var = this.e.a;
        return new tvo(d, this.c, e231Var, new mdo(new cxq0(e231Var, (jb7) cxq0Var.c, (gp50) cxq0Var.w, (yvi0) cxq0Var.x, 17)), this.f, str);
    }

    @Override // defpackage.rvo
    public final c231 getVariable(String str) {
        return this.d.k(str);
    }
}
