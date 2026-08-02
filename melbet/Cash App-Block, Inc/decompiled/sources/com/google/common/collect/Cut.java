package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class Cut implements Comparable, Serializable {
    public final Comparable endpoint;

    public final class AboveValue extends Cut {
        @Override // com.google.common.collect.Cut
        public final void describeAsLowerBound(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return ~this.endpoint.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final boolean isLessThan(Comparable comparable) {
            Range range = Range.ALL;
            return this.endpoint.compareTo(comparable) < 0;
        }

        public final String toString() {
            return "/" + this.endpoint + "\\";
        }
    }

    public Cut(Comparable comparable) {
        this.endpoint = comparable;
    }

    @Override // java.lang.Comparable
    public int compareTo(Cut cut) {
        if (cut == AboveAll.INSTANCE$1) {
            return 1;
        }
        if (cut == AboveAll.INSTANCE) {
            return -1;
        }
        Comparable comparable = cut.endpoint;
        Range range = Range.ALL;
        int compareTo = this.endpoint.compareTo(comparable);
        return compareTo != 0 ? compareTo : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public abstract void describeAsLowerBound(StringBuilder sb);

    public abstract void describeAsUpperBound(StringBuilder sb);

    public Comparable endpoint() {
        return this.endpoint;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    public abstract boolean isLessThan(Comparable comparable);

    public final class AboveAll extends Cut {
        public static final AboveAll INSTANCE = new AboveAll("", 0);
        public static final AboveAll INSTANCE$1 = new AboveAll("", 1);
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AboveAll(Comparable comparable, int i) {
            super(comparable);
            this.$r8$classId = i;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return ((Cut) obj) == this ? 0 : 1;
                case 1:
                    return ((Cut) obj) == this ? 0 : -1;
                default:
                    return super.compareTo(obj);
            }
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsLowerBound(StringBuilder sb) {
            switch (this.$r8$classId) {
                case 0:
                    throw new AssertionError();
                case 1:
                    sb.append("(-∞");
                    return;
                default:
                    sb.append('[');
                    sb.append(this.endpoint);
                    return;
            }
        }

        @Override // com.google.common.collect.Cut
        public final void describeAsUpperBound(StringBuilder sb) {
            switch (this.$r8$classId) {
                case 0:
                    sb.append("+∞)");
                    return;
                case 1:
                    throw new AssertionError();
                default:
                    sb.append(this.endpoint);
                    sb.append(')');
                    return;
            }
        }

        @Override // com.google.common.collect.Cut
        public Comparable endpoint() {
            switch (this.$r8$classId) {
                case 0:
                    throw new IllegalStateException("range unbounded on this side");
                case 1:
                    throw new IllegalStateException("range unbounded on this side");
                default:
                    return super.endpoint();
            }
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            switch (this.$r8$classId) {
                case 0:
                    return System.identityHashCode(this);
                case 1:
                    return System.identityHashCode(this);
                default:
                    return this.endpoint.hashCode();
            }
        }

        @Override // com.google.common.collect.Cut
        public final boolean isLessThan(Comparable comparable) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    Range range = Range.ALL;
                    if (this.endpoint.compareTo(comparable) <= 0) {
                        break;
                    }
                    break;
            }
            return true;
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "+∞";
                case 1:
                    return "-∞";
                default:
                    return "\\" + this.endpoint + "/";
            }
        }

        @Override // com.google.common.collect.Cut
        public int compareTo(Cut cut) {
            switch (this.$r8$classId) {
                case 0:
                    return cut == this ? 0 : 1;
                case 1:
                    return cut == this ? 0 : -1;
                default:
                    return super.compareTo(cut);
            }
        }
    }
}
