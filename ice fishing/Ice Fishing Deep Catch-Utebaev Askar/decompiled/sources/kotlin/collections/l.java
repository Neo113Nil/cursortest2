package kotlin.collections;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f175b;

    public /* synthetic */ l(int i2, Object obj) {
        this.f174a = i2;
        this.f175b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i2 = this.f174a;
        Object obj = this.f175b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object[] array = (Object[]) obj;
                Intrinsics.checkNotNullParameter(array, "array");
                return new e(array);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new k.m(this);
            default:
                return (Iterator) obj;
        }
    }

    public l(BufferedReader reader) {
        this.f174a = 2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f175b = reader;
    }
}
