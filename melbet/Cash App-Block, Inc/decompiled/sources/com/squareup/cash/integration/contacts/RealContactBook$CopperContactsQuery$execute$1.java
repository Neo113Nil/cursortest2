package com.squareup.cash.integration.contacts;

import android.database.Cursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.integration.contacts.RealContactBook;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealContactBook$CopperContactsQuery$execute$1 extends RestrictedSuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public /* synthetic */ Object L$0;
    public Closeable L$1;
    public Cursor L$2;
    public int label;
    public final /* synthetic */ RealContactBook.CopperContactsQuery this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactBook$CopperContactsQuery$execute$1(RealContactBook.CopperContactsQuery copperContactsQuery, Continuation continuation) {
        super(2, continuation);
        this.this$0 = copperContactsQuery;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealContactBook$CopperContactsQuery$execute$1 realContactBook$CopperContactsQuery$execute$1 = new RealContactBook$CopperContactsQuery$execute$1(this.this$0, continuation);
        realContactBook$CopperContactsQuery$execute$1.L$0 = obj;
        return realContactBook$CopperContactsQuery$execute$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealContactBook$CopperContactsQuery$execute$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Cursor run;
        Throwable th;
        Closeable closeable;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int i;
        String string2;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        String str = null;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            run = this.this$0.query.run();
            if (run != null) {
                try {
                    columnIndex = run.getColumnIndex("mimetype");
                    columnIndex2 = run.getColumnIndex("data1");
                    columnIndex3 = run.getColumnIndex("data1");
                    columnIndex4 = run.getColumnIndex("lookup");
                    columnIndex5 = run.getColumnIndex("display_name");
                    i = 0;
                    closeable = run;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = run;
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        columnIndex5 = this.I$5;
        columnIndex4 = this.I$4;
        columnIndex3 = this.I$3;
        columnIndex2 = this.I$2;
        columnIndex = this.I$1;
        i = this.I$0;
        run = this.L$2;
        closeable = this.L$1;
        try {
            SafeTrace.throwOnFailure(obj);
        } catch (Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (Throwable th4) {
                Utf8.closeFinally(closeable, th);
                throw th4;
            }
        }
        if (!run.moveToNext()) {
            Utf8.closeFinally(closeable, null);
            return Unit.INSTANCE;
        }
        String string3 = run.getString(columnIndex);
        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/email_v2")) {
            string2 = null;
            str = run.getString(columnIndex3);
        } else {
            string2 = Intrinsics.areEqual(string3, "vnd.android.cursor.item/phone_v2") ? run.getString(columnIndex2) : null;
        }
        String string4 = run.getString(columnIndex5);
        string4.getClass();
        String string5 = run.getString(columnIndex4);
        string5.getClass();
        ContactBook$Contact$HashedAliasContact contactBook$Contact$HashedAliasContact = new ContactBook$Contact$HashedAliasContact(string5, string4, str, string2);
        this.L$0 = sequenceScope;
        this.L$1 = closeable;
        this.L$2 = run;
        this.I$0 = i;
        this.I$1 = columnIndex;
        this.I$2 = columnIndex2;
        this.I$3 = columnIndex3;
        this.I$4 = columnIndex4;
        this.I$5 = columnIndex5;
        this.label = 1;
        sequenceScope.yield(contactBook$Contact$HashedAliasContact, this);
        return coroutineSingletons;
    }
}
