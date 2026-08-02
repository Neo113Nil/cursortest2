package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.l;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class wme0 extends GeneratedMessageLite implements au10 {
    private static final wme0 DEFAULT_INSTANCE;
    private static volatile qf90 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, ane0> preferences_ = MapFieldLite.a;

    static {
        wme0 wme0Var = new wme0();
        DEFAULT_INSTANCE = wme0Var;
        GeneratedMessageLite.m(wme0.class, wme0Var);
    }

    public static MapFieldLite p(wme0 wme0Var) {
        if (!wme0Var.preferences_.b()) {
            wme0Var.preferences_ = wme0Var.preferences_.f();
        }
        return wme0Var.preferences_;
    }

    public static ume0 r() {
        return (ume0) ((l) DEFAULT_INSTANCE.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    public static wme0 s(FileInputStream fileInputStream) {
        wme0 wme0Var = DEFAULT_INSTANCE;
        e eVar = new e(fileInputStream);
        qyo a = qyo.a();
        GeneratedMessageLite l = wme0Var.l();
        try {
            fvf0 fvf0Var = fvf0.c;
            fvf0Var.getClass();
            tom0 a2 = fvf0Var.a(l.getClass());
            f fVar = (f) eVar.b;
            if (fVar == null) {
                fVar = new f(eVar);
            }
            a2.g(l, fVar, a);
            a2.c(l);
            if (GeneratedMessageLite.i(l, true)) {
                return (wme0) l;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.i(l);
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.i(l);
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException2.i(l);
            throw invalidProtocolBufferException2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException3 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException3.i(l);
            throw invalidProtocolBufferException3;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        qf90 qf90Var;
        switch (tme0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new wme0();
            case 2:
                return new ume0(DEFAULT_INSTANCE);
            case 3:
                return new v9i0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", vme0.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                qf90 qf90Var2 = PARSER;
                if (qf90Var2 != null) {
                    return qf90Var2;
                }
                synchronized (wme0.class) {
                    try {
                        qf90Var = PARSER;
                        if (qf90Var == null) {
                            qf90Var = new pxs(DEFAULT_INSTANCE);
                            PARSER = qf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
