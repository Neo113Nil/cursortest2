package defpackage;

import com.yandex.go.places.models.data.entities.network.MediaDto$PhotoMediaDto;
import com.yandex.go.places.models.data.entities.network.MediaDto$VideoMediaDto;
import com.yandex.go.places.models.data.entities.network.a0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class rd10 extends xqt {
    public static final rd10 e = new rd10();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a0.INSTANCE.serializer(), qoi0.a(a0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("PHOTO", MediaDto$PhotoMediaDto.Companion.serializer(), qoi0.a(MediaDto$PhotoMediaDto.class)), new f9("VIDEO_STREAM", MediaDto$VideoMediaDto.Companion.serializer(), qoi0.a(MediaDto$VideoMediaDto.class)));
    }
}
