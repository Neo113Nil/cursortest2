package defpackage;

/* loaded from: classes.dex */
public final class tj implements pj {
    public final /* synthetic */ int a;

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        switch (this.a) {
            case 0:
                r7fVar.getClass();
                fx6Var.getClass();
                obj.getClass();
                r7fVar.getClass();
                obj.getClass();
                irf.V(r7fVar, obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                r7fVar.getClass();
                fx6Var.getClass();
                r7fVar.J(booleanValue);
                return;
            case 2:
                double doubleValue = ((Number) obj).doubleValue();
                r7fVar.getClass();
                fx6Var.getClass();
                r7fVar.y(doubleValue);
                return;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                r7fVar.getClass();
                fx6Var.getClass();
                r7fVar.y(floatValue);
                return;
            case 4:
                int intValue = ((Number) obj).intValue();
                r7fVar.getClass();
                fx6Var.getClass();
                r7fVar.u(intValue);
                return;
            case 5:
                long longValue = ((Number) obj).longValue();
                r7fVar.getClass();
                fx6Var.getClass();
                r7fVar.t(longValue);
                return;
            case 6:
                String str = (String) obj;
                r7fVar.getClass();
                fx6Var.getClass();
                str.getClass();
                r7fVar.m0(str);
                return;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                r7fVar.getClass();
                fx6Var.getClass();
                throw null;
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        switch (this.a) {
            case 0:
                a7fVar.getClass();
                fx6Var.getClass();
                a7fVar.getClass();
                Object d0 = saf.d0(a7fVar);
                d0.getClass();
                return d0;
            case 1:
                a7fVar.getClass();
                fx6Var.getClass();
                return Boolean.valueOf(a7fVar.nextBoolean());
            case 2:
                a7fVar.getClass();
                fx6Var.getClass();
                return Double.valueOf(a7fVar.nextDouble());
            case 3:
                a7fVar.getClass();
                fx6Var.getClass();
                return Float.valueOf((float) a7fVar.nextDouble());
            case 4:
                a7fVar.getClass();
                fx6Var.getClass();
                return Integer.valueOf(a7fVar.nextInt());
            case 5:
                a7fVar.getClass();
                fx6Var.getClass();
                return Long.valueOf(a7fVar.nextLong());
            case 6:
                return ouj.l(a7fVar, fx6Var);
            default:
                throw ouj.h(a7fVar, fx6Var, "File Upload used in output position");
        }
    }
}
