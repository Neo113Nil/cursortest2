package androidx.media3.extractor;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.List;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public interface Extractor {
    default List getSniffFailureDetails() {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        return RegularImmutableList.EMPTY;
    }

    void init(ExtractorOutput extractorOutput);

    int read(ExtractorInput extractorInput, IadFrame iadFrame);

    void release();

    void seek(long j, long j2);

    boolean sniff(ExtractorInput extractorInput);
}
