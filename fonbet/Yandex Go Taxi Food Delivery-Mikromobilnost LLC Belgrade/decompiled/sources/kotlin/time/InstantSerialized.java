package kotlin.time;

import defpackage.vng;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/time/InstantSerialized;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "epochSeconds", "J", "getEpochSeconds", "()J", "setEpochSeconds", "(J)V", "", "nanosecondsOfSecond", CA20Status.STATUS_USER_I, "getNanosecondsOfSecond", "()I", "setNanosecondsOfSecond", "(I)V", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
final class InstantSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    private long epochSeconds;
    private int nanosecondsOfSecond;

    public InstantSerialized(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
    }

    private final Object readResolve() {
        Instant instant = Instant.a;
        return vng.m(this.nanosecondsOfSecond, this.epochSeconds);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.epochSeconds = objectInput.readLong();
        this.nanosecondsOfSecond = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.epochSeconds);
        objectOutput.writeInt(this.nanosecondsOfSecond);
    }

    public InstantSerialized() {
        this(0L, 0);
    }
}
