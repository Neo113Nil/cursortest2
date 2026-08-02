package ru.CryptoPro.JCSP.support;

import java.io.File;
import java.util.Comparator;
import ru.CryptoPro.JCSP.support.BKSTrustStore;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$needUpdate$0;
        lambda$needUpdate$0 = BKSTrustStore.AnonymousClass1.lambda$needUpdate$0((File) obj, (File) obj2);
        return lambda$needUpdate$0;
    }
}
