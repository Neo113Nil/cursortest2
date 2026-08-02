package flex.parser.transition;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
