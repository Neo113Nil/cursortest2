package com.datadog.trace.common.writer;

import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface Writer extends Closeable {
    void write(ArrayList arrayList);
}
