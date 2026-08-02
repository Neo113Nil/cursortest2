package app.cash.redwood.protocol.host;

import com.caverock.androidsvg.SVG;
import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public interface WidgetHostProtocol {
    /* renamed from: createNode-z3jyS0k */
    ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg);

    int[] getChildrenTags();

    /* renamed from: propertyDeserializer-FsYNNkA */
    KSerializer mo1198propertyDeserializerFsYNNkA(int i);
}
