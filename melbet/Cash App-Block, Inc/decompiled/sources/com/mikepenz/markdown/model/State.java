package com.mikepenz.markdown.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public interface State {

    /* loaded from: classes4.dex */
    public final class Error implements State {
        public final ReferenceLinkHandlerImpl referenceLinkHandler;
        public final Throwable result;

        public Error(Throwable th, ReferenceLinkHandlerImpl referenceLinkHandlerImpl) {
            referenceLinkHandlerImpl.getClass();
            this.result = th;
            this.referenceLinkHandler = referenceLinkHandlerImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.result.equals(error.result) && Intrinsics.areEqual(this.referenceLinkHandler, error.referenceLinkHandler);
        }

        @Override // com.mikepenz.markdown.model.State
        public final ReferenceLinkHandlerImpl getReferenceLinkHandler() {
            return this.referenceLinkHandler;
        }

        public final int hashCode() {
            return this.referenceLinkHandler.hashCode() + (this.result.hashCode() * 31);
        }

        public final String toString() {
            return "Error(result=" + this.result + ", referenceLinkHandler=" + this.referenceLinkHandler + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class Loading implements State {
        public final ReferenceLinkHandlerImpl referenceLinkHandler;

        public Loading(ReferenceLinkHandlerImpl referenceLinkHandlerImpl) {
            referenceLinkHandlerImpl.getClass();
            this.referenceLinkHandler = referenceLinkHandlerImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.referenceLinkHandler, ((Loading) obj).referenceLinkHandler);
        }

        @Override // com.mikepenz.markdown.model.State
        public final ReferenceLinkHandlerImpl getReferenceLinkHandler() {
            return this.referenceLinkHandler;
        }

        public final int hashCode() {
            return this.referenceLinkHandler.hashCode();
        }

        public final String toString() {
            return "Loading(referenceLinkHandler=" + this.referenceLinkHandler + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class Success implements State {
        public final String content;
        public final ASTNodeImpl node;
        public final ReferenceLinkHandlerImpl referenceLinkHandler;

        public Success(ASTNodeImpl aSTNodeImpl, String str, ReferenceLinkHandlerImpl referenceLinkHandlerImpl) {
            aSTNodeImpl.getClass();
            str.getClass();
            referenceLinkHandlerImpl.getClass();
            this.node = aSTNodeImpl;
            this.content = str;
            this.referenceLinkHandler = referenceLinkHandlerImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.node, success.node) && Intrinsics.areEqual(this.content, success.content) && Intrinsics.areEqual(this.referenceLinkHandler, success.referenceLinkHandler);
        }

        @Override // com.mikepenz.markdown.model.State
        public final ReferenceLinkHandlerImpl getReferenceLinkHandler() {
            return this.referenceLinkHandler;
        }

        public final int hashCode() {
            return this.referenceLinkHandler.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.node.hashCode() * 31, 31, this.content), 31, true);
        }

        public final String toString() {
            return "Success(node=" + this.node + ", content=" + this.content + ", linksLookedUp=true, referenceLinkHandler=" + this.referenceLinkHandler + ")";
        }
    }

    ReferenceLinkHandlerImpl getReferenceLinkHandler();
}
