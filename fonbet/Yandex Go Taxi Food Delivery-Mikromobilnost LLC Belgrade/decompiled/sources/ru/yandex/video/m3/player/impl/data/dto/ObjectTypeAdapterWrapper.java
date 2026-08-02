package ru.yandex.video.m3.player.impl.data.dto;

import com.google.gson.stream.JsonToken;
import defpackage.afx;
import defpackage.avu0;
import defpackage.bvu0;
import defpackage.nl11;
import defpackage.wdx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/impl/data/dto/ObjectTypeAdapterWrapper;", "T", "Lnl11;", "delegate", "<init>", "(Lnl11;)V", "Lafx;", "jsonWriter", "value", "Lzy11;", "write", "(Lafx;Ljava/lang/Object;)V", "Lwdx;", "jsonReader", "read", "(Lwdx;)Ljava/lang/Object;", "Lnl11;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ObjectTypeAdapterWrapper<T> extends nl11 {
    private final nl11 delegate;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ObjectTypeAdapterWrapper(nl11 nl11Var) {
        this.delegate = nl11Var;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    @Override // defpackage.nl11
    public T read(wdx jsonReader) {
        JsonToken R = jsonReader.R();
        if ((R == null ? -1 : WhenMappings.$EnumSwitchMapping$0[R.ordinal()]) != 1) {
            return (T) this.delegate.read(jsonReader);
        }
        ?? r2 = (T) jsonReader.nextString();
        T t = (T) bvu0.m(10, r2);
        return (t == null && (t = (T) avu0.i(r2)) == null) ? r2 : t;
    }

    @Override // defpackage.nl11
    public void write(afx jsonWriter, T value) {
        this.delegate.write(jsonWriter, value);
    }
}
