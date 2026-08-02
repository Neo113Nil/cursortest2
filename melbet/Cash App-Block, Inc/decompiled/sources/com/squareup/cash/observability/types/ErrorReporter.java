package com.squareup.cash.observability.types;

import java.util.Map;
import kotlin.Metadata;

/* loaded from: classes.dex */
public interface ErrorReporter {

    public final class Companion implements ErrorReporter {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static ErrorReporter INSTANCE;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/cash/observability/types/ErrorReporter$Companion$ErrorReporterInstanceNotSetError", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "types"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public final class ErrorReporterInstanceNotSetError extends IllegalStateException {
            @Override // java.lang.Throwable
            public final String getMessage() {
                return "Singleton instance of ErrorReporter not set up.\nIf this happened in a unit test, set up FakeErrorReporterRule and add explicit validation of your `ErrorReporter` calls.\nIf this happened in the app, there's a bug with how ErrorReporter is being set up in the app initialization routine.";
            }
        }

        @Override // com.squareup.cash.observability.types.ErrorReporter
        public final void annotateException(Throwable th, Map map) {
            map.getClass();
            ErrorReporter errorReporter = INSTANCE;
            if (errorReporter == null) {
                throw new ErrorReporterInstanceNotSetError();
            }
            errorReporter.annotateException(th, map);
        }

        @Override // com.squareup.cash.observability.types.ErrorReporter
        public final void report(ReportedError reportedError, SampleStrategy sampleStrategy) {
            reportedError.getClass();
            sampleStrategy.getClass();
            ErrorReporter errorReporter = INSTANCE;
            if (errorReporter == null) {
                throw new ErrorReporterInstanceNotSetError();
            }
            errorReporter.report(reportedError, sampleStrategy);
        }
    }

    public final class DefaultSamplingStrategy implements SampleStrategy {
        public static final DefaultSamplingStrategy INSTANCE = new DefaultSamplingStrategy();

        @Override // com.squareup.cash.observability.types.SampleStrategy
        public final boolean shouldCollectEvent(ReportedError reportedError) {
            reportedError.getClass();
            return true;
        }
    }

    void annotateException(Throwable th, Map map);

    void report(ReportedError reportedError, SampleStrategy sampleStrategy);
}
