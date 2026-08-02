package defpackage;

import java.io.File;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes.dex */
public interface ra7 {
    NavigableSet addListener(String str, oa7 oa7Var);

    void applyContentMetadataMutations(String str, che cheVar);

    void commitFile(File file, long j);

    long getCacheSpace();

    long getCachedBytes(String str, long j, long j2);

    long getCachedLength(String str, long j, long j2);

    NavigableSet getCachedSpans(String str);

    bhe getContentMetadata(String str);

    Set getKeys();

    long getUid();

    boolean isCached(String str, long j, long j2);

    void release();

    void releaseHoleSpan(lc7 lc7Var);

    void removeListener(String str, oa7 oa7Var);

    void removeResource(String str);

    void removeSpan(lc7 lc7Var);

    File startFile(String str, long j, long j2);

    lc7 startReadWrite(String str, long j, long j2);

    lc7 startReadWriteNonBlocking(String str, long j, long j2);
}
