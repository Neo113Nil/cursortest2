package androidx.paging;

import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.IdGenerationStrategy$Random;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class LoadState {
    public final boolean endOfPaginationReached;

    public final class Error extends LoadState {
        public final Throwable error;

        public Error(Throwable th) {
            super(false);
            this.error = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.endOfPaginationReached == error.endOfPaginationReached && this.error.equals(error.error);
        }

        public final int hashCode() {
            return this.error.hashCode() + Boolean.hashCode(this.endOfPaginationReached);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.endOfPaginationReached + ", error=" + this.error + ')';
        }
    }

    public final class Loading extends LoadState {
        public static final Loading INSTANCE = new Loading(false);

        public final boolean equals(Object obj) {
            if (obj instanceof Loading) {
                return this.endOfPaginationReached == ((Loading) obj).endOfPaginationReached;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.endOfPaginationReached);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Loading(endOfPaginationReached="), this.endOfPaginationReached, ')');
        }
    }

    public final class NotLoading extends LoadState {
        public static final NotLoading Complete = new NotLoading(true);
        public static final NotLoading Incomplete = new NotLoading(false);

        public final boolean equals(Object obj) {
            if (obj instanceof NotLoading) {
                return this.endOfPaginationReached == ((NotLoading) obj).endOfPaginationReached;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.endOfPaginationReached);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("NotLoading(endOfPaginationReached="), this.endOfPaginationReached, ')');
        }
    }

    public /* synthetic */ LoadState(boolean z) {
        this.endOfPaginationReached = z;
    }

    public static LoadState fromName(String str, final boolean z) {
        final int i;
        final int i2;
        String upperCase = str.toUpperCase(Locale.US);
        upperCase.getClass();
        i = 1;
        i2 = 0;
        switch (upperCase) {
            case "RANDOM":
                return new IdGenerationStrategy$Random(z);
            case "SEQUENTIAL":
                return new LoadState(z, i) { // from class: com.datadog.trace.api.IdGenerationStrategy$SRandom
                    public final /* synthetic */ int $r8$classId;
                    public final Serializable secureRandom;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(z);
                        this.$r8$classId = i;
                        switch (i) {
                            case 1:
                                super(z);
                                this.secureRandom = new AtomicLong(0L);
                                return;
                            default:
                                try {
                                    this.secureRandom = SecureRandom.getInstanceStrong();
                                    return;
                                } catch (Throwable th) {
                                    throw new ExceptionInInitializerError(th);
                                }
                        }
                    }

                    @Override // androidx.paging.LoadState
                    public DDTraceId generateTraceId() {
                        switch (this.$r8$classId) {
                            case 1:
                                return DD64bTraceId.create(((AtomicLong) this.secureRandom).incrementAndGet(), null);
                            default:
                                return super.generateTraceId();
                        }
                    }

                    @Override // androidx.paging.LoadState
                    public final long getNonZeroPositiveLong() {
                        int i3 = this.$r8$classId;
                        Serializable serializable = this.secureRandom;
                        switch (i3) {
                            case 0:
                                SecureRandom secureRandom = (SecureRandom) serializable;
                                long nextLong = secureRandom.nextLong();
                                while (true) {
                                    long j = nextLong & Long.MAX_VALUE;
                                    if (j != 0) {
                                        return j;
                                    }
                                    nextLong = secureRandom.nextLong();
                                }
                            default:
                                return ((AtomicLong) serializable).incrementAndGet();
                        }
                    }
                };
            case "SECURE_RANDOM":
                return new LoadState(z, i2) { // from class: com.datadog.trace.api.IdGenerationStrategy$SRandom
                    public final /* synthetic */ int $r8$classId;
                    public final Serializable secureRandom;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(z);
                        this.$r8$classId = i2;
                        switch (i2) {
                            case 1:
                                super(z);
                                this.secureRandom = new AtomicLong(0L);
                                return;
                            default:
                                try {
                                    this.secureRandom = SecureRandom.getInstanceStrong();
                                    return;
                                } catch (Throwable th) {
                                    throw new ExceptionInInitializerError(th);
                                }
                        }
                    }

                    @Override // androidx.paging.LoadState
                    public DDTraceId generateTraceId() {
                        switch (this.$r8$classId) {
                            case 1:
                                return DD64bTraceId.create(((AtomicLong) this.secureRandom).incrementAndGet(), null);
                            default:
                                return super.generateTraceId();
                        }
                    }

                    @Override // androidx.paging.LoadState
                    public final long getNonZeroPositiveLong() {
                        int i3 = this.$r8$classId;
                        Serializable serializable = this.secureRandom;
                        switch (i3) {
                            case 0:
                                SecureRandom secureRandom = (SecureRandom) serializable;
                                long nextLong = secureRandom.nextLong();
                                while (true) {
                                    long j = nextLong & Long.MAX_VALUE;
                                    if (j != 0) {
                                        return j;
                                    }
                                    nextLong = secureRandom.nextLong();
                                }
                            default:
                                return ((AtomicLong) serializable).incrementAndGet();
                        }
                    }
                };
            default:
                return null;
        }
    }

    public DDTraceId generateTraceId() {
        return this.endOfPaginationReached ? new DD128bTraceId((System.currentTimeMillis() / 1000) << 32, getNonZeroPositiveLong(), null) : DD64bTraceId.create(getNonZeroPositiveLong(), null);
    }

    public abstract long getNonZeroPositiveLong();
}
