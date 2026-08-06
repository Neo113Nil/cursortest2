package io.flutter.plugin.editing;

import P0.t;
import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
public final class d extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f7789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, f fVar) {
        super(tVar, true);
        this.f7789a = fVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f7789a;
    }
}
