package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import c0.r;

/* loaded from: classes.dex */
public final class d extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, f fVar) {
        super(rVar, true);
        this.f2395a = fVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f2395a;
    }
}
