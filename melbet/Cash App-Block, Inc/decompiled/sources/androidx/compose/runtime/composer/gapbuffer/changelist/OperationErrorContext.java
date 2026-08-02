package androidx.compose.runtime.composer.gapbuffer.changelist;

import java.util.List;

/* loaded from: classes.dex */
public interface OperationErrorContext {
    List buildStackTrace(Integer num);

    boolean getSourceInformationEnabled();
}
