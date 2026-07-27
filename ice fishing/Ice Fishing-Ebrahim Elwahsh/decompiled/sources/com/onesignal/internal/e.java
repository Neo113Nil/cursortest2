package com.onesignal.internal;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {
        public static final a INSTANCE = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends e {
        private final I4.c logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I4.c logLevel) {
            super(null);
            h.e(logLevel, "logLevel");
            this.logLevel = logLevel;
        }

        public static /* synthetic */ b copy$default(b bVar, I4.c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = bVar.logLevel;
            }
            return bVar.copy(cVar);
        }

        public final I4.c component1() {
            return this.logLevel;
        }

        public final b copy(I4.c logLevel) {
            h.e(logLevel, "logLevel");
            return new b(logLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.logLevel == ((b) obj).logLevel;
        }

        public final I4.c getLogLevel() {
            return this.logLevel;
        }

        public int hashCode() {
            return this.logLevel.hashCode();
        }

        public String toString() {
            return "Enable(logLevel=" + this.logLevel + ')';
        }
    }

    public static final class c extends e {
        public static final c INSTANCE = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends e {
        private final I4.c newLevel;
        private final I4.c oldLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(I4.c oldLevel, I4.c newLevel) {
            super(null);
            h.e(oldLevel, "oldLevel");
            h.e(newLevel, "newLevel");
            this.oldLevel = oldLevel;
            this.newLevel = newLevel;
        }

        public static /* synthetic */ d copy$default(d dVar, I4.c cVar, I4.c cVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = dVar.oldLevel;
            }
            if ((i & 2) != 0) {
                cVar2 = dVar.newLevel;
            }
            return dVar.copy(cVar, cVar2);
        }

        public final I4.c component1() {
            return this.oldLevel;
        }

        public final I4.c component2() {
            return this.newLevel;
        }

        public final d copy(I4.c oldLevel, I4.c newLevel) {
            h.e(oldLevel, "oldLevel");
            h.e(newLevel, "newLevel");
            return new d(oldLevel, newLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.oldLevel == dVar.oldLevel && this.newLevel == dVar.newLevel;
        }

        public final I4.c getNewLevel() {
            return this.newLevel;
        }

        public final I4.c getOldLevel() {
            return this.oldLevel;
        }

        public int hashCode() {
            return this.newLevel.hashCode() + (this.oldLevel.hashCode() * 31);
        }

        public String toString() {
            return "UpdateLogLevel(oldLevel=" + this.oldLevel + ", newLevel=" + this.newLevel + ')';
        }
    }

    public /* synthetic */ e(kotlin.jvm.internal.e eVar) {
        this();
    }

    private e() {
    }
}
