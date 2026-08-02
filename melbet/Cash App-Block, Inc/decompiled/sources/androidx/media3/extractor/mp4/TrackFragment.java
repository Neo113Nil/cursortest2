package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;

/* loaded from: classes3.dex */
public final class TrackFragment {
    public long auxiliaryDataPosition;
    public long dataPosition;
    public boolean definesEncryptionData;
    public DefaultSampleValues header;
    public long nextFragmentDecodeTime;
    public boolean nextFragmentDecodeTimeIncludesMoov;
    public int sampleCount;
    public boolean sampleEncryptionDataNeedsFill;
    public TrackEncryptionBox trackEncryptionBox;
    public int trunCount;
    public long[] trunDataPosition = new long[0];
    public int[] trunLength = new int[0];
    public int[] sampleSizeTable = new int[0];
    public long[] samplePresentationTimesUs = new long[0];
    public boolean[] sampleIsSyncFrameTable = new boolean[0];
    public boolean[] sampleHasSubsampleEncryptionTable = new boolean[0];
    public final ParsableByteArray sampleEncryptionData = new ParsableByteArray();
}
