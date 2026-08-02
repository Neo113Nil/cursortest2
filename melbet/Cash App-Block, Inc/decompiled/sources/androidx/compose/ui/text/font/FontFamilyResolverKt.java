package androidx.compose.ui.text.font;

import androidx.work.impl.WorkLauncherImpl;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes.dex */
public abstract class FontFamilyResolverKt {
    public static final WorkLauncherImpl GlobalTypefaceRequestCache = new WorkLauncherImpl(14);
    public static final GrpcMethod GlobalAsyncTypefaceCache = new GrpcMethod(10, false);
}
