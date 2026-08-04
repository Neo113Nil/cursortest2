package org.junit.internal.management;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class FakeRuntimeMXBean implements RuntimeMXBean {
    FakeRuntimeMXBean() {
    }

    @Override // org.junit.internal.management.RuntimeMXBean
    public List<String> getInputArguments() {
        return Collections.EMPTY_LIST;
    }
}
