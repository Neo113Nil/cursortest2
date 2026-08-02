package com.google.common.cache;

import defpackage.crn;
import defpackage.dig;
import defpackage.iig;
import defpackage.jig;
import defpackage.kig;
import defpackage.lig;
import defpackage.oig;
import defpackage.pig;
import defpackage.qhg;
import defpackage.qig;
import java.util.logging.Logger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 1, list:
  (r0v0 ?? I:??[OBJECT, ARRAY]) from 0x005a: FILLED_NEW_ARRAY 
  (r0v0 ?? I:??[OBJECT, ARRAY])
  (r1v1 ?? I:??[OBJECT, ARRAY])
  (r3v1 ?? I:??[OBJECT, ARRAY])
  (r5v1 ?? I:??[OBJECT, ARRAY])
  (r7v1 ?? I:??[OBJECT, ARRAY])
  (r9v1 ?? I:??[OBJECT, ARRAY])
  (r11v1 ?? I:??[OBJECT, ARRAY])
  (r13v1 ?? I:??[OBJECT, ARRAY])
 A[WRAPPED] (LINE:91) elemType: com.google.common.cache.LocalCache$EntryFactory
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
abstract class LocalCache$EntryFactory {
    STRONG { // from class: com.google.common.cache.LocalCache$EntryFactory.1
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            return new lig(k, i, crnVar);
        }
    },
    STRONG_ACCESS { // from class: com.google.common.cache.LocalCache$EntryFactory.2
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            jig jigVar = new jig(k, i, crnVar, 0);
            jigVar.f = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            jigVar.g = digVar;
            jigVar.h = digVar;
            return jigVar;
        }
    },
    STRONG_WRITE { // from class: com.google.common.cache.LocalCache$EntryFactory.3
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            jig jigVar = new jig(k, i, crnVar, 1);
            jigVar.f = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            jigVar.g = digVar;
            jigVar.h = digVar;
            return jigVar;
        }
    },
    STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache$EntryFactory.4
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            kig kigVar = new kig(k, i, crnVar);
            kigVar.e = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            kigVar.f = digVar;
            kigVar.g = digVar;
            kigVar.h = Long.MAX_VALUE;
            kigVar.i = digVar;
            kigVar.j = digVar;
            return kigVar;
        }
    },
    WEAK { // from class: com.google.common.cache.LocalCache$EntryFactory.5
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            return new qig(aVar.h, k, i, crnVar);
        }
    },
    WEAK_ACCESS { // from class: com.google.common.cache.LocalCache$EntryFactory.6
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            oig oigVar = new oig(aVar.h, k, i, crnVar, 0);
            oigVar.e = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            oigVar.f = digVar;
            oigVar.g = digVar;
            return oigVar;
        }
    },
    WEAK_WRITE { // from class: com.google.common.cache.LocalCache$EntryFactory.7
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            oig oigVar = new oig(aVar.h, k, i, crnVar, 1);
            oigVar.e = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            oigVar.f = digVar;
            oigVar.g = digVar;
            return oigVar;
        }
    },
    WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache$EntryFactory.8
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i, crn crnVar) {
            pig pigVar = new pig(aVar.h, k, i, crnVar);
            pigVar.d = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            pigVar.e = digVar;
            pigVar.f = digVar;
            pigVar.g = Long.MAX_VALUE;
            pigVar.h = digVar;
            pigVar.i = digVar;
            return pigVar;
        }
    };

    public static final LocalCache$EntryFactory[] i = {new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.1
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            return new lig(k, i2, crnVar);
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.2
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            jig jigVar = new jig(k, i2, crnVar, 0);
            jigVar.f = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            jigVar.g = digVar;
            jigVar.h = digVar;
            return jigVar;
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.3
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            jig jigVar = new jig(k, i2, crnVar, 1);
            jigVar.f = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            jigVar.g = digVar;
            jigVar.h = digVar;
            return jigVar;
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.4
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            kig kigVar = new kig(k, i2, crnVar);
            kigVar.e = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            kigVar.f = digVar;
            kigVar.g = digVar;
            kigVar.h = Long.MAX_VALUE;
            kigVar.i = digVar;
            kigVar.j = digVar;
            return kigVar;
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.5
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            return new qig(aVar.h, k, i2, crnVar);
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.6
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            oig oigVar = new oig(aVar.h, k, i2, crnVar, 0);
            oigVar.e = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            oigVar.f = digVar;
            oigVar.g = digVar;
            return oigVar;
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.7
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            oig oigVar = new oig(aVar.h, k, i2, crnVar, 1);
            oigVar.e = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            oigVar.f = digVar;
            oigVar.g = digVar;
            return oigVar;
        }
    }, new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.8
        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
            crn copyEntry = super.copyEntry(aVar, crnVar, crnVar2, k);
            copyAccessEntry(crnVar, copyEntry);
            copyWriteEntry(crnVar, copyEntry);
            return copyEntry;
        }

        @Override // com.google.common.cache.LocalCache$EntryFactory
        public final <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar) {
            pig pigVar = new pig(aVar.h, k, i2, crnVar);
            pigVar.d = Long.MAX_VALUE;
            Logger logger = b.v;
            dig digVar = dig.a;
            pigVar.e = digVar;
            pigVar.f = digVar;
            pigVar.g = Long.MAX_VALUE;
            pigVar.h = digVar;
            pigVar.i = digVar;
            return pigVar;
        }
    }};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.cache.LocalCache$EntryFactory$1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.common.cache.LocalCache$EntryFactory$7] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.common.cache.LocalCache$EntryFactory$8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.cache.LocalCache$EntryFactory$2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.cache.LocalCache$EntryFactory$3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.common.cache.LocalCache$EntryFactory$4] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.common.cache.LocalCache$EntryFactory$5] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.common.cache.LocalCache$EntryFactory$6] */
    static {
    }

    private LocalCache$EntryFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalCache$EntryFactory getFactory(iig iigVar, boolean z, boolean z2) {
        return i[(iigVar == iig.c ? (char) 4 : (char) 0) | (z ? 1 : 0) | (z2 ? 2 : 0)];
    }

    public static LocalCache$EntryFactory valueOf(String str) {
        return (LocalCache$EntryFactory) Enum.valueOf(LocalCache$EntryFactory.class, str);
    }

    public static LocalCache$EntryFactory[] values() {
        return (LocalCache$EntryFactory[]) j.clone();
    }

    public final <K, V> void copyAccessEntry(crn crnVar, crn crnVar2) {
        crnVar2.o(crnVar.p());
        crn a = crnVar.a();
        Logger logger = b.v;
        a.i(crnVar2);
        crnVar2.e(a);
        crn h = crnVar.h();
        crnVar2.i(h);
        h.e(crnVar2);
        dig digVar = dig.a;
        crnVar.i(digVar);
        crnVar.e(digVar);
    }

    public <K, V> crn copyEntry(a aVar, crn crnVar, crn crnVar2, K k) {
        return newEntry(aVar, k, crnVar.l(), crnVar2);
    }

    public final <K, V> void copyWriteEntry(crn crnVar, crn crnVar2) {
        crnVar2.q(crnVar.n());
        crn k = crnVar.k();
        Logger logger = b.v;
        k.d(crnVar2);
        crnVar2.c(k);
        crn f = crnVar.f();
        crnVar2.d(f);
        f.c(crnVar2);
        dig digVar = dig.a;
        crnVar.d(digVar);
        crnVar.c(digVar);
    }

    public abstract <K, V> crn newEntry(a aVar, K k, int i2, crn crnVar);

    public LocalCache$EntryFactory(qhg qhgVar) {
    }
}
