package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;
import com.yandex.pulse.metrics.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes8.dex */
public final class tcy extends GeneratedMessageLite implements ucy {
    private static final tcy DEFAULT_INSTANCE;
    public static final int HISTOGRAM_EVENT_FIELD_NUMBER = 2;
    public static final int LIBRARY_PROFILE_FIELD_NUMBER = 1;
    private static volatile of90 PARSER;
    private int bitField0_;
    private oqw histogramEvent_ = GeneratedMessageLite.emptyProtobufList();
    private LibraryProtos$LibraryProfileProto libraryProfile_;

    static {
        tcy tcyVar = new tcy();
        DEFAULT_INSTANCE = tcyVar;
        GeneratedMessageLite.registerDefaultInstance(tcy.class, tcyVar);
    }

    private tcy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHistogramEvent(Iterable<? extends blu> iterable) {
        ensureHistogramEventIsMutable();
        b.addAll(iterable, this.histogramEvent_);
    }

    private void addHistogramEvent(blu bluVar) {
        bluVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(bluVar);
    }

    private void clearHistogramEvent() {
        this.histogramEvent_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLibraryProfile() {
        this.libraryProfile_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureHistogramEventIsMutable() {
        oqw oqwVar = this.histogramEvent_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.histogramEvent_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static tcy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLibraryProfile(LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto) {
        libraryProtos$LibraryProfileProto.getClass();
        LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto2 = this.libraryProfile_;
        if (libraryProtos$LibraryProfileProto2 == null || libraryProtos$LibraryProfileProto2 == LibraryProtos$LibraryProfileProto.getDefaultInstance()) {
            this.libraryProfile_ = libraryProtos$LibraryProfileProto;
        } else {
            this.libraryProfile_ = (LibraryProtos$LibraryProfileProto) ((a) LibraryProtos$LibraryProfileProto.newBuilder(this.libraryProfile_).mergeFrom((GeneratedMessageLite) libraryProtos$LibraryProfileProto)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static scy newBuilder() {
        return (scy) DEFAULT_INSTANCE.createBuilder();
    }

    public static tcy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (tcy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tcy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeHistogramEvent(int i) {
        ensureHistogramEventIsMutable();
        this.histogramEvent_.remove(i);
    }

    private void setHistogramEvent(int i, blu bluVar) {
        bluVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.set(i, bluVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLibraryProfile(LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto) {
        libraryProtos$LibraryProfileProto.getClass();
        this.libraryProfile_ = libraryProtos$LibraryProfileProto;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (rcy.a[methodToInvoke.ordinal()]) {
            case 1:
                return new tcy();
            case 2:
                return new scy(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "libraryProfile_", "histogramEvent_", blu.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (tcy.class) {
                    try {
                        of90Var = PARSER;
                        if (of90Var == null) {
                            of90Var = new oxs(DEFAULT_INSTANCE);
                            PARSER = of90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return of90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public blu getHistogramEvent(int i) {
        return (blu) this.histogramEvent_.get(i);
    }

    public int getHistogramEventCount() {
        return this.histogramEvent_.size();
    }

    public List<blu> getHistogramEventList() {
        return this.histogramEvent_;
    }

    public elu getHistogramEventOrBuilder(int i) {
        return (elu) this.histogramEvent_.get(i);
    }

    public List<? extends elu> getHistogramEventOrBuilderList() {
        return this.histogramEvent_;
    }

    public LibraryProtos$LibraryProfileProto getLibraryProfile() {
        LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto = this.libraryProfile_;
        return libraryProtos$LibraryProfileProto == null ? LibraryProtos$LibraryProfileProto.getDefaultInstance() : libraryProtos$LibraryProfileProto;
    }

    public boolean hasLibraryProfile() {
        return (this.bitField0_ & 1) != 0;
    }

    public static scy newBuilder(tcy tcyVar) {
        return (scy) DEFAULT_INSTANCE.createBuilder(tcyVar);
    }

    public static tcy parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (tcy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static tcy parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static tcy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static tcy parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    private void addHistogramEvent(int i, blu bluVar) {
        bluVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(i, bluVar);
    }

    public static tcy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tcy parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static tcy parseFrom(InputStream inputStream) throws IOException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tcy parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static tcy parseFrom(eac eacVar) throws IOException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static tcy parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (tcy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
