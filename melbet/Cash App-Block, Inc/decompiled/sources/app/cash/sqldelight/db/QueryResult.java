package app.cash.sqldelight.db;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface QueryResult {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class AsyncValue implements QueryResult {
        public final Function1 getter;

        @Override // app.cash.sqldelight.db.QueryResult
        public final Object await(ContinuationImpl continuationImpl) {
            return this.getter.invoke(continuationImpl);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AsyncValue) {
                return this.getter.equals(((AsyncValue) obj).getter);
            }
            return false;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public final /* bridge */ Object getValue() {
            DefaultImpls.getValue();
            throw null;
        }

        public final int hashCode() {
            return this.getter.hashCode();
        }

        public final String toString() {
            return "AsyncValue(getter=" + this.getter + ')';
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final Unit Unit = Unit.INSTANCE;
    }

    /* loaded from: classes3.dex */
    public abstract class DefaultImpls {
        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewEarningsTrackerWithParams.deepLinkSpecs;
        }

        public static void getValue() {
            throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
        }
    }

    public final class Value implements QueryResult {
        public final Object value;

        public /* synthetic */ Value(Object obj) {
            this.value = obj;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public final Object await(ContinuationImpl continuationImpl) {
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Value) {
                return Intrinsics.areEqual(this.value, ((Value) obj).value);
            }
            return false;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public final Object getValue() {
            return this.value;
        }

        public final int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "Value(value=" + this.value + ')';
        }
    }

    Object await(ContinuationImpl continuationImpl);

    Object getValue();
}
