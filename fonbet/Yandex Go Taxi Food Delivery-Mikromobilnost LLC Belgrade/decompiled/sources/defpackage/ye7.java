package defpackage;

import jason.statham.interpreter.error.a;

/* loaded from: classes9.dex */
public final class ye7 {
    public final jnj a = new jnj(16);
    public final jnj b = new jnj(16);
    public boolean c = true;

    public final void a(int i) {
        jnj jnjVar;
        while (true) {
            jnjVar = this.b;
            int i2 = jnjVar.c;
            if (i2 <= 0 || ((Number) jnjVar.a[i2 - 1]).intValue() < i) {
                break;
            } else {
                b();
            }
        }
        jnjVar.b(Integer.valueOf(i));
        this.c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0313, code lost:
    
        if (((java.lang.Number) r4).doubleValue() >= ((java.lang.Number) r3).doubleValue()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0316, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x036f, code lost:
    
        r0 = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x032b, code lost:
    
        if (((java.lang.Number) r4).doubleValue() >= ((java.lang.Number) r3).longValue()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0345, code lost:
    
        if (((java.lang.Number) r4).longValue() >= ((java.lang.Number) r3).doubleValue()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x035a, code lost:
    
        if (((java.lang.Number) r4).longValue() >= ((java.lang.Number) r3).longValue()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x036d, code lost:
    
        if (((java.lang.String) r4).compareTo((java.lang.String) r3) >= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03a5, code lost:
    
        if (((java.lang.Number) r4).doubleValue() <= ((java.lang.Number) r3).doubleValue()) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03a8, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0401, code lost:
    
        r0 = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03bd, code lost:
    
        if (((java.lang.Number) r4).doubleValue() <= ((java.lang.Number) r3).longValue()) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03d7, code lost:
    
        if (((java.lang.Number) r4).longValue() <= ((java.lang.Number) r3).doubleValue()) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ec, code lost:
    
        if (((java.lang.Number) r4).longValue() <= ((java.lang.Number) r3).longValue()) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ff, code lost:
    
        if (((java.lang.String) r4).compareTo((java.lang.String) r3) <= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0437, code lost:
    
        if (((java.lang.Number) r4).doubleValue() > ((java.lang.Number) r3).doubleValue()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x043a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0493, code lost:
    
        r0 = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x044f, code lost:
    
        if (((java.lang.Number) r4).doubleValue() > ((java.lang.Number) r3).longValue()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0469, code lost:
    
        if (((java.lang.Number) r4).longValue() > ((java.lang.Number) r3).doubleValue()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x047e, code lost:
    
        if (((java.lang.Number) r4).longValue() > ((java.lang.Number) r3).longValue()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0491, code lost:
    
        if (((java.lang.String) r4).compareTo((java.lang.String) r3) > 0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04c9, code lost:
    
        if (((java.lang.Number) r4).doubleValue() < ((java.lang.Number) r3).doubleValue()) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04cc, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0525, code lost:
    
        r0 = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04e1, code lost:
    
        if (((java.lang.Number) r4).doubleValue() < ((java.lang.Number) r3).longValue()) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04fb, code lost:
    
        if (((java.lang.Number) r4).longValue() < ((java.lang.Number) r3).doubleValue()) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0510, code lost:
    
        if (((java.lang.Number) r4).longValue() < ((java.lang.Number) r3).longValue()) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0523, code lost:
    
        if (((java.lang.String) r4).compareTo((java.lang.String) r3) < 0) goto L261;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Object valueOf;
        int intValue = ((Number) this.b.a()).intValue();
        boolean z = true;
        jnj jnjVar = this.a;
        if (intValue == 16) {
            Object a = jnjVar.a();
            if (intValue != 16) {
                throw a.i("Undefined unary operator with id " + intValue);
            }
            if (a instanceof Boolean) {
                jnjVar.b(Boolean.valueOf(!((Boolean) a).booleanValue()));
                return;
            }
            throw a.a("Inversion of " + rhb1.e(a) + " is not defined");
        }
        Object a2 = jnjVar.a();
        Object a3 = jnjVar.a();
        switch (intValue) {
            case 5:
                valueOf = Boolean.valueOf(a3.equals(a2));
                break;
            case 6:
                valueOf = Boolean.valueOf(!a3.equals(a2));
                break;
            case 7:
                if (a3 instanceof Double) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (a3 instanceof Long) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!(a3 instanceof String) || !(a2 instanceof String)) {
                    throw a.a("Comparison of " + a3 + " and " + a2 + " is not defined");
                }
                break;
                break;
            case 8:
                if (a3 instanceof Double) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (a3 instanceof Long) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!(a3 instanceof String) || !(a2 instanceof String)) {
                    throw a.a("Comparison of " + a3 + " and " + a2 + " is not defined");
                }
                break;
                break;
            case 9:
                if (a3 instanceof Double) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (a3 instanceof Long) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!(a3 instanceof String) || !(a2 instanceof String)) {
                    throw a.a("Comparison of " + a3 + " and " + a2 + " is not defined");
                }
                break;
                break;
            case 10:
                if (a3 instanceof Double) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (a3 instanceof Long) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!(a3 instanceof String) || !(a2 instanceof String)) {
                    throw a.a("Comparison of " + a3 + " and " + a2 + " is not defined");
                }
                break;
            case 11:
                if (a3 instanceof Long) {
                    if (!(a2 instanceof Long)) {
                        if (a2 instanceof Double) {
                            valueOf = Double.valueOf(((Number) a2).doubleValue() + ((Number) a3).doubleValue());
                            break;
                        }
                    } else {
                        valueOf = Long.valueOf(((Number) a2).longValue() + ((Number) a3).longValue());
                        break;
                    }
                }
                if (a3 instanceof Double) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            valueOf = Double.valueOf(((Number) a2).doubleValue() + ((Number) a3).doubleValue());
                            break;
                        }
                    } else {
                        valueOf = Double.valueOf(((Number) a2).doubleValue() + ((Number) a3).doubleValue());
                        break;
                    }
                }
                if (!(a3 instanceof String) || !(a2 instanceof String)) {
                    throw a.a("Addition is not defined for " + a3 + " and " + a2);
                }
                valueOf = ((String) a3) + a2;
                break;
                break;
            case 12:
                if (a3 instanceof Long) {
                    if (!(a2 instanceof Long)) {
                        if (a2 instanceof Double) {
                            valueOf = Double.valueOf(((Number) a3).doubleValue() - ((Number) a2).doubleValue());
                            break;
                        }
                    } else {
                        valueOf = Long.valueOf(((Number) a3).longValue() - ((Number) a2).longValue());
                        break;
                    }
                }
                if (a3 instanceof Double) {
                    if (!(a2 instanceof Double)) {
                        if (a2 instanceof Long) {
                            valueOf = Double.valueOf(((Number) a3).doubleValue() - ((Number) a2).doubleValue());
                            break;
                        }
                    } else {
                        valueOf = Double.valueOf(((Number) a3).doubleValue() - ((Number) a2).doubleValue());
                        break;
                    }
                }
                throw a.a("Subtraction is not defined for " + a3 + " and " + a2);
            case 13:
                valueOf = bb1.A(a3, a2);
                break;
            case 14:
                if (a3 instanceof Long) {
                    if (a2 instanceof Long) {
                        if (!a2.equals(0L)) {
                            valueOf = Long.valueOf(((Number) a3).longValue() / ((Number) a2).longValue());
                            break;
                        } else {
                            throw a.a("Division by zero is forbidden");
                        }
                    } else if (a2 instanceof Double) {
                        Number number = (Number) a2;
                        if (number.doubleValue() == 0.0d) {
                            throw a.a("Division by zero is forbidden");
                        }
                        valueOf = Double.valueOf(((Number) a3).doubleValue() / number.doubleValue());
                        break;
                    }
                }
                if (a3 instanceof Double) {
                    if (a2 instanceof Double) {
                        Number number2 = (Number) a2;
                        if (number2.doubleValue() == 0.0d) {
                            throw a.a("Division by zero is forbidden");
                        }
                        valueOf = Double.valueOf(((Number) a3).doubleValue() / number2.doubleValue());
                        break;
                    } else if (a2 instanceof Long) {
                        if (!a2.equals(0L)) {
                            valueOf = Double.valueOf(((Number) a3).doubleValue() / ((Number) a2).doubleValue());
                            break;
                        } else {
                            throw a.a("Division by zero is forbidden");
                        }
                    }
                }
                throw a.a("Division is not defined for " + a3 + " and " + a2);
            case 15:
                if (a3 instanceof Long) {
                    if (a2 instanceof Long) {
                        if (!a2.equals(0L)) {
                            valueOf = Long.valueOf(((Number) a3).longValue() % ((Number) a2).longValue());
                            break;
                        } else {
                            throw a.a("Division by zero is forbidden");
                        }
                    } else if (a2 instanceof Double) {
                        Number number3 = (Number) a2;
                        if (number3.doubleValue() == 0.0d) {
                            throw a.a("Division by zero is forbidden");
                        }
                        valueOf = Double.valueOf(((Number) a3).doubleValue() % number3.doubleValue());
                        break;
                    }
                }
                if (a3 instanceof Double) {
                    if (a2 instanceof Double) {
                        Number number4 = (Number) a2;
                        if (number4.doubleValue() == 0.0d) {
                            throw a.a("Division by zero is forbidden");
                        }
                        valueOf = Double.valueOf(((Number) a3).doubleValue() % number4.doubleValue());
                        break;
                    } else if (a2 instanceof Long) {
                        if (!a2.equals(0L)) {
                            valueOf = Double.valueOf(((Number) a3).doubleValue() % ((Number) a2).doubleValue());
                            break;
                        } else {
                            throw a.a("Division by zero is forbidden");
                        }
                    }
                }
                throw a.a("Remainder is not defined for " + a3 + " and " + a2);
            default:
                throw a.i("Unsupported binary operator with id " + intValue);
        }
        jnjVar.b(valueOf);
    }

    public final Object c(int i) {
        while (true) {
            jnj jnjVar = this.b;
            int i2 = jnjVar.c;
            if (i2 <= 0 || ((Number) jnjVar.a[i2 - 1]).intValue() < i) {
                break;
            }
            b();
        }
        this.c = true;
        return this.a.a();
    }

    public final void d(Object obj) {
        this.a.b(obj);
        this.c = false;
    }
}
