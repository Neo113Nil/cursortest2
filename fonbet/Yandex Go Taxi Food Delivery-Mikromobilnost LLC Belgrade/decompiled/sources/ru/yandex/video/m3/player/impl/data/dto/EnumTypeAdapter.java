package ru.yandex.video.m3.player.impl.data.dto;

import com.google.gson.stream.JsonToken;
import defpackage.afx;
import defpackage.nl11;
import defpackage.wdx;
import defpackage.ysq0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.data.dto.Default;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R8\u0010\u0018\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00120\u0016j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u0012`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/data/dto/EnumTypeAdapter;", "T", "Lnl11;", "Ljava/lang/Class;", "classOfT", "<init>", "(Ljava/lang/Class;)V", "Lwdx;", "reader", "read", "(Lwdx;)Ljava/lang/Object;", "Lafx;", "out", "value", "Lzy11;", "write", "(Lafx;Ljava/lang/Object;)V", "Ljava/util/TreeMap;", "", "", "nameToConstant", "Ljava/util/TreeMap;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "constantToName", "Ljava/util/HashMap;", "defaultEnum", "Ljava/lang/Enum;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EnumTypeAdapter<T> extends nl11 {
    public static final int $stable = 8;
    private Enum<?> defaultEnum;
    private final TreeMap<String, Enum<?>> nameToConstant = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    private final HashMap<Enum<?>, String> constantToName = new HashMap<>();

    public EnumTypeAdapter(Class<T> cls) {
        List list;
        String value;
        try {
            T[] enumConstants = cls.getEnumConstants();
            if (enumConstants != null) {
                list = new ArrayList(enumConstants.length);
                for (Enum r0 : enumConstants) {
                    list.add(r0);
                }
            } else {
                list = null;
            }
            for (Enum<?> r2 : list == null ? EmptyList.a : list) {
                String name = r2.name();
                ysq0 ysq0Var = (ysq0) cls.getField(name).getAnnotation(ysq0.class);
                Default r5 = (Default) cls.getField(name).getAnnotation(Default.class);
                this.nameToConstant.put(name, r2);
                HashMap<Enum<?>, String> hashMap = this.constantToName;
                if (ysq0Var != null && (value = ysq0Var.value()) != null) {
                    name = value;
                }
                hashMap.put(r2, name);
                if (ysq0Var != null) {
                    this.nameToConstant.put(ysq0Var.value(), r2);
                    for (String str : ysq0Var.alternate()) {
                        this.nameToConstant.put(str, r2);
                    }
                }
                if (r5 != null) {
                    this.defaultEnum = r2;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.nl11
    public T read(wdx reader) throws IOException {
        if (reader.R() == JsonToken.NULL) {
            reader.B0();
            T t = (T) this.defaultEnum;
            if (t == null) {
                return null;
            }
            return t;
        }
        T t2 = (T) ((Enum) this.nameToConstant.get(reader.nextString()));
        if (t2 == null) {
            t2 = (T) this.defaultEnum;
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nl11
    public void write(afx out, T value) throws IOException {
        out.W(value == 0 ? null : this.constantToName.get((Enum) value));
    }
}
