package androidx.media3.common.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class GlUtil$GlException extends Exception {
    public GlUtil$GlException(String str, RegularImmutableList regularImmutableList) {
        super(str);
        ImmutableList.copyOf((Collection) regularImmutableList);
    }
}
